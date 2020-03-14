package io.github.nakahiro386.spring.boot.example.batch.configuration;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.batch.MyBatisBatchItemWriter;
import org.mybatis.spring.batch.builder.MyBatisBatchItemWriterBuilder;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.explore.JobExplorer;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.boot.autoconfigure.batch.JobLauncherCommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.StringUtils;

import io.github.nakahiro386.spring.boot.example.batch.dto.Person;
import io.github.nakahiro386.spring.boot.example.batch.item.PersonItemProcessor;
import io.github.nakahiro386.spring.boot.example.batch.listener.JobCompletionNotificationListener;
import io.github.nakahiro386.spring.boot.example.domain.entity.People;
import lombok.RequiredArgsConstructor;

@Configuration
@EnableBatchProcessing
@RequiredArgsConstructor
public class BatchConfiguration {

    private final JobBuilderFactory jobBuilderFactory;
    private final StepBuilderFactory stepBuilderFactory;
    private final SqlSessionFactory sqlSessionFactory;

    @Bean
    // @ConditionalOnMissingBean
    // @ConditionalOnProperty(prefix = "spring.batch.job", name = "enabled", havingValue = "true", matchIfMissing =
    // true)
    // org.springframework.boot.autoconfigure.batch.BatchAutoConfiguration#jobLauncherCommandLineRunner(JobLauncher,
    // JobExplorer, JobRepository, BatchProperties)
    public JobLauncherCommandLineRunner jobLauncherCommandLineRunner(JobLauncher jobLauncher, JobExplorer jobExplorer,
            JobRepository jobRepository, BatchProperties properties) {
        JobLauncherCommandLineRunner runner = new JobLauncherCommandLineRunner(jobLauncher, jobExplorer, jobRepository);
        String jobNames = properties.getJob().getNames();
        if (StringUtils.hasText(jobNames)) {
            runner.setJobNames(jobNames);
        } else {
            runner.setJobNames("dummy");
        }
        return runner;
    }

    @Bean
    public FlatFileItemReader<Person> reader() {
        return new FlatFileItemReaderBuilder<Person>()
                .name("personItemReader")
                .resource(new ClassPathResource("sample-data.csv"))
                .delimited()
                .names(new String[] { "firstName", "lastName" })
                .fieldSetMapper(new BeanWrapperFieldSetMapper<Person>() {
                    {
                        setTargetType(Person.class);
                    }
                })
                .build();
    }

    @Bean
    public PersonItemProcessor processor() {
        return new PersonItemProcessor();
    }

    @Bean
    public MyBatisBatchItemWriter<People> writer() {
        return new MyBatisBatchItemWriterBuilder<People>()
                .sqlSessionFactory(sqlSessionFactory)
                .statementId("io.github.nakahiro386.spring.boot.example.domain.sqlmap.PeopleMapper.insert")
                .build();
    }

    @Bean
    public Job importUserJob(JobCompletionNotificationListener listener, Step step1) {
        return jobBuilderFactory.get("importUserJob")
                .incrementer(new RunIdIncrementer())
                .listener(listener)
                .flow(step1)
                .end()
                .build();
    }

    @Bean
    public Step step1() {
        return stepBuilderFactory.get("step1")
                .<Person, People> chunk(10)
                .reader(reader())
                .processor(processor())
                .writer(writer())
                .build();
    }
}
