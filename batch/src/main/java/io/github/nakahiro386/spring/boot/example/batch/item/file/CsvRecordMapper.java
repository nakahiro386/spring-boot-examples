package io.github.nakahiro386.spring.boot.example.batch.item.file;

import org.apache.commons.csv.CSVRecord;

public interface CsvRecordMapper<T> {

  T mapRecord(CSVRecord record) throws Exception;
}
