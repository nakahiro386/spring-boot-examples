package io.github.nakahiro386.spring.boot.example.batch.configuration;

import io.github.nakahiro386.spring.boot.example.batch.dto.AdAddress;
import io.github.nakahiro386.spring.boot.example.domain.entity.Addresses;
import io.github.nakahiro386.spring.boot.example.domain.sqlmap.AddressesMapper;
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
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
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
  public FlatFileItemReader<AdAddress> adAddressReader() {
    return new FlatFileItemReaderBuilder<AdAddress>().name("adAddressReader")
        .resource(new ClassPathResource("zenkoku.csv")).encoding("MS932").linesToSkip(1).delimited()
        .names(new String[] {"id", "kenId", "cityId", "townId", "zip", "officeFlg", "deleteFlg",
            "kenName", "kenFuri", "cityName", "cityFuri", "townName", "townFuri", "townMemo",
            "kyotoStreet", "blockName", "blockFuri", "memo", "officeName", "officeFuri",
            "officeAddress", "newId"})
        .fieldSetMapper(new BeanWrapperFieldSetMapper<AdAddress>() {
          {
            setTargetType(AdAddress.class);
          }
        }).build();
  }

  /**
   * new ItemProcessor.
   *
   * @return ItemProcessor
   */
  @Bean
  public ItemProcessor<AdAddress, Addresses> addressProcessor() {
    return new ItemProcessor<AdAddress, Addresses>() {

      @Override
      public Addresses process(AdAddress item) throws Exception {
        // TODO toStringで桁埋める。
        Addresses address = new Addresses().withAdAddressId(item.getId())
            .withPrefectureCode(item.getKenId().toString())
            .withCityCode(item.getCityId().toString()).withZipCode(item.getZip().replace("-", ""))
            .withOfficeFlg(item.getOfficeFlg().toString())
            .withDeleteFlg(item.getDeleteFlg().toString()).withPrefectureName(item.getKenName())
            .withPrefectureNameKana(item.getKenFuri()).withCityName(item.getCityName())
            .withCityNameKana(item.getCityFuri()).withTownAreaName(item.getTownName())
            .withTownAreaNameKana(item.getTownFuri()).withTownAreaMemo(item.getTownMemo())
            .withCityBlockName(item.getBlockName()).withCityBlockNameKana(item.getBlockFuri())
            .withMemo(item.getMemo()).withOfficeName(item.getOfficeName())
            .withOfficeNameKana(item.getOfficeFuri())
            .withOfficeOfficeAddress(item.getOfficeAddress()).withNewAdAddressId(item.getNewId());
        return address;
      }
    };

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
