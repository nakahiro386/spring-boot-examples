package io.github.nakahiro386.spring.boot.example.fw.batch.item.file;

import org.apache.commons.csv.CSVRecord;
import org.springframework.batch.item.ParseException;

public class CsvFileParseException extends ParseException {

  private CSVRecord record;

  public CsvFileParseException(String message, CSVRecord record) {
    super(message);
    this.record = record;
  }

  public CsvFileParseException(String message, Throwable cause, CSVRecord record) {
    super(message, cause);
    this.record = record;
  }

  public CSVRecord getRecord() {
    return record;
  }
}
