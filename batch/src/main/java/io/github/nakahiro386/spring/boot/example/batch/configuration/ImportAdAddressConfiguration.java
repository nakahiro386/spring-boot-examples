package io.github.nakahiro386.spring.boot.example.batch.configuration;

import io.github.nakahiro386.spring.boot.example.batch.dto.AdAddress;
import io.github.nakahiro386.spring.boot.example.batch.item.AddressItemProcessor;
import io.github.nakahiro386.spring.boot.example.batch.item.file.mapping.AdAddressHeaders;
import io.github.nakahiro386.spring.boot.example.batch.item.file.mapping.AdAddressMapper;
import io.github.nakahiro386.spring.boot.example.domain.entity.Addresses;
import io.github.nakahiro386.spring.boot.example.domain.sqlmap.AddressesMapper;
import io.github.nakahiro386.spring.boot.example.fw.batch.item.file.CsvFileItemReader;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.batch.MyBatisBatchItemWriter;
import org.mybatis.spring.batch.builder.MyBatisBatchItemWriterBuilder;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

@Configuration
@EnableBatchProcessing
@RequiredArgsConstructor
public class ImportAdAddressConfiguration {
  private final JobBuilderFactory jobBuilderFactory;
  private final StepBuilderFactory stepBuilderFactory;

  private final AddressesMapper addressesMapper;
  private final SqlSessionFactory sqlSessionFactory;

  /**
   * new FlatFileItemReader.
   *
   * @return FlatFileItemReader
   */
  @Bean
  public CsvFileItemReader<AdAddress> adAddressReader() {
    CsvFileItemReader<AdAddress> reader = new CsvFileItemReader<>();
    reader.setResource(new ClassPathResource("zenkoku.csv"));
    reader.setEncoding("MS932");
    reader.setCsvRecordMapper(new AdAddressMapper());
    reader.setFormat(CsvFileItemReader.DEFAULT_CSV_FORMAT.withHeader(AdAddressHeaders.class)
        .withSkipHeaderRecord());
    return reader;
  }

  /**
   * new ItemProcessor.
   *
   * @return ItemProcessor
   */
  @Bean
  public ItemProcessor<AdAddress, Addresses> addressProcessor() {
    return new AddressItemProcessor();
  }

  @Bean
  public MyBatisBatchItemWriter<Addresses> addressWriter() {
    return new MyBatisBatchItemWriterBuilder<Addresses>().sqlSessionFactory(sqlSessionFactory)
        .statementId(AddressesMapper.class.getName() + ".insert").build();
  }

  /**
   * new deleteAddressTasklet.
   *
   * @return Tasklet
   */
  @Bean
  public Tasklet deleteAddressTasklet() {
    return new Tasklet() {
      @Override
      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext)
          throws Exception {
        int delete = addressesMapper.deleteByExample(null);
        contribution.incrementWriteCount(delete);
        return RepeatStatus.FINISHED;
      }

    };
  }

  @Bean
  public Step importAdAddressStep1() {
    return stepBuilderFactory.get("importAdAddressStep1").tasklet(deleteAddressTasklet()).build();
  }

  @Bean
  public Step importAdAddressStep2() {
    return stepBuilderFactory.get("importAdAddressStep2").<AdAddress, Addresses>chunk(100)
        .reader(adAddressReader()).processor(addressProcessor()).writer(addressWriter()).build();
  }

  @Bean
  public Job importAdAddress() {
    return jobBuilderFactory.get("importAdAddress").incrementer(new RunIdIncrementer())
        .start(importAdAddressStep1()).next(importAdAddressStep2()).build();
  }

}
