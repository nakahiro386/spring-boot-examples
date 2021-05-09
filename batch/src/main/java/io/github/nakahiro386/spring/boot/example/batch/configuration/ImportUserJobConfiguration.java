package io.github.nakahiro386.spring.boot.example.batch.configuration;

import io.github.nakahiro386.spring.boot.example.batch.dto.Person;
import io.github.nakahiro386.spring.boot.example.batch.item.PersonItemProcessor;
import io.github.nakahiro386.spring.boot.example.batch.listener.JobCompletionNotificationListener;
import io.github.nakahiro386.spring.boot.example.domain.entity.People;
import io.github.nakahiro386.spring.boot.example.domain.sqlmap.PeopleMapper;
import org.mybatis.spring.batch.MyBatisBatchItemWriter;
import org.mybatis.spring.batch.builder.MyBatisBatchItemWriterBuilder;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;

public class ImportUserJobConfiguration extends AbstractJobConfiguration {

  @Bean
  public Job importUserJob(JobCompletionNotificationListener listener, Step step1) {
    return jobBuilderFactory.get("importUserJob").incrementer(new RunIdIncrementer())
        .listener(listener).flow(step1).end().build();
  }

  @Bean
  public Step step1() {
    return stepBuilderFactory.get("step1").<Person, People>chunk(10).reader(reader())
        .processor(processor()).writer(writer()).build();
  }

  /**
   * new FlatFileItemReader.
   *
   * @return FlatFileItemReader
   */
  @Bean
  public FlatFileItemReader<Person> reader() {
    return new FlatFileItemReaderBuilder<Person>().name("personItemReader")
        .resource(new ClassPathResource("sample-data.csv")).delimited()
        .names(new String[] {"firstName", "lastName"})
        .fieldSetMapper(new BeanWrapperFieldSetMapper<Person>() {
          {
            setTargetType(Person.class);
          }
        }).build();
  }

  @Bean
  public PersonItemProcessor processor() {
    return new PersonItemProcessor();
  }

  /**
   * new MyBatisBatchItemWriter.
   *
   * @return MyBatisBatchItemWriter
   */
  @Bean
  public MyBatisBatchItemWriter<People> writer() {
    return new MyBatisBatchItemWriterBuilder<People>().sqlSessionFactory(sqlSessionFactory)
        .statementId(PeopleMapper.class.getName() + ".insert").build();
  }

}
