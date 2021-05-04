package io.github.nakahiro386.spring.boot.example.fw.batch.item.file;

import java.nio.charset.Charset;
import java.util.Iterator;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.batch.item.ReaderNotOpenException;
import org.springframework.batch.item.file.ResourceAwareItemReaderItemStream;
import org.springframework.batch.item.support.AbstractItemCountingItemStreamItemReader;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.core.io.Resource;
import org.springframework.util.Assert;
import org.springframework.util.ClassUtils;

public class CsvFileItemReader<T> extends AbstractItemCountingItemStreamItemReader<T>
    implements ResourceAwareItemReaderItemStream<T>, InitializingBean {

  public static final String DEFAULT_CHARSET = Charset.defaultCharset().name();
  public static final CSVFormat DEFAULT_CSV_FORMAT = CSVFormat.RFC4180;

  private static final Log logger = LogFactory.getLog(CsvFileItemReader.class);
  private Resource resource;
  private boolean noInput = false;
  private String encoding = DEFAULT_CHARSET;
  private int linesToSkip = 0;
  private boolean strict = true;
  private CSVParser parser;
  private Iterator<CSVRecord> recordIterator;
  private CSVFormat format = DEFAULT_CSV_FORMAT;
  private CsvRecordMapper<T> recordMapper;

  public CsvFileItemReader() {
    setName(ClassUtils.getShortName(CsvFileItemReader.class));
  }

  @Override
  public void afterPropertiesSet() throws Exception {
    Assert.notNull(recordMapper, "CsvRecordMapper is required");
  }

  /**
   * In strict mode the reader will throw an exception on
   * {@link #open(org.springframework.batch.item.ExecutionContext)} if the input resource does not
   * exist.
   *
   * @param strict <code>true</code> by default
   */
  public void setStrict(boolean strict) {
    this.strict = strict;
  }

  /**
   * Public setter for the number of lines to skip at the start of a file. Can be used if the file
   * contains a header without useful (column name) information, and without a comment delimiter at
   * the beginning of the lines.
   *
   * @param linesToSkip the number of lines to skip
   */
  public void setLinesToSkip(int linesToSkip) {
    this.linesToSkip = linesToSkip;
  }

  /**
   * Setter for CSVFormat.
   *
   * @param format CSVFormat
   */
  public void setFormat(CSVFormat format) {
    this.format = format;
  }

  /**
   * Setter for CSVRecord mapper. This property is required to be set.
   *
   * @param recordMapper maps record to item
   */
  public void setCsvRecordMapper(CsvRecordMapper<T> recordMapper) {
    this.recordMapper = recordMapper;
  }

  /**
   * Setter for the encoding for this input source. Default value is {@link #DEFAULT_CHARSET}.
   *
   * @param encoding a properties object which possibly contains the encoding for this input file;
   */
  public void setEncoding(String encoding) {
    this.encoding = encoding;
  }

  @Override
  public void setResource(Resource resource) {
    this.resource = resource;
  }

  @Override
  protected void doOpen() throws Exception {
    Assert.notNull(resource, "Input resource must be set");
    noInput = true;
    if (!resource.exists()) {
      if (strict) {
        throw new IllegalStateException(
            "Input resource must exist (reader is in 'strict' mode): " + resource);
      }
      logger.warn("Input resource does not exist " + resource.getDescription());
      return;
    }

    if (!resource.isReadable()) {
      if (strict) {
        throw new IllegalStateException(
            "Input resource must be readable (reader is in 'strict' mode): " + resource);
      }
      logger.warn("Input resource is not readable " + resource.getDescription());
      return;
    }

    parser = CSVParser.parse(resource.getInputStream(), Charset.forName(encoding), format);
    recordIterator = parser.iterator();
    for (int i = 0; i < linesToSkip; i++) {
      readRecored();
    }
    noInput = false;

  }

  @Override
  protected T doRead() throws Exception {
    if (noInput) {
      return null;
    }

    CSVRecord record = readRecored();

    if (record == null) {
      return null;
    } else {
      try {
        return recordMapper.mapRecord(record);
      } catch (Exception ex) {
        throw new CsvFileParseException("Parsing error in resource=[" + resource.getDescription()
            + "], input=[" + record.toString() + "]", ex, record);
      }
    }
  }


  private CSVRecord readRecored() {

    if (parser == null || recordIterator == null) {
      throw new ReaderNotOpenException("parser must be open before it can be read.");
    }
    CSVRecord record = null;
    if (recordIterator.hasNext()) {
      record = recordIterator.next();
    }

    return record;
  }

  @Override
  protected void doClose() throws Exception {
    recordIterator = null;
    if (parser != null) {
      parser.close();
    }
  }

}
