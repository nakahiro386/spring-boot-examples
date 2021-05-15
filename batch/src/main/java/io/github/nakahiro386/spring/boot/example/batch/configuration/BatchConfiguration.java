package io.github.nakahiro386.spring.boot.example.batch.configuration;

import io.github.nakahiro386.spring.boot.example.batch.listener.LoggingJobExecutionListener;
import io.github.nakahiro386.spring.boot.example.batch.listener.LoggingStepExecutionListener;
import io.github.nakahiro386.spring.boot.example.domain.DomainConfiguration;
import io.github.nakahiro386.spring.boot.example.fw.batch.domain.plugin.BatchAuditingProvider;
import io.github.nakahiro386.spring.boot.example.fw.domain.plugin.AuditingProvider;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.JobRegistry;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobScope;
import org.springframework.batch.core.configuration.support.ApplicationContextFactory;
import org.springframework.batch.core.configuration.support.GenericApplicationContextFactory;
import org.springframework.batch.core.explore.JobExplorer;
import org.springframework.batch.core.job.AbstractJob;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.AbstractStep;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.boot.autoconfigure.batch.JobLauncherApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.util.StringUtils;

@RequiredArgsConstructor
@Configuration
@EnableBatchProcessing(modular = true)
@Import(DomainConfiguration.class)
public class BatchConfiguration {
  private final JobRegistry jobRegistry;

  /**
   * new JobLauncherCommandLineRunner.
   *
   * <p>
   * {@link org.springframework.boot.autoconfigure.batch.BatchAutoConfiguration#jobLauncherApplicationRunner(JobLauncher, JobExplorer, JobRepository, BatchProperties)}
   * </p>
   *
   * @param jobLauncher jobLauncher
   * @param jobExplorer jobExplorer
   * @param jobRepository jobRepository
   * @param properties properties
   * @return JobLauncherCommandLineRunner
   */
  @Bean
  // @ConditionalOnMissingBean
  // @ConditionalOnProperty(prefix = "spring.batch.job", name = "enabled",
  // havingValue = "true",
  // matchIfMissing = true)
  public JobLauncherApplicationRunner jobLauncherApplicationRunner(JobLauncher jobLauncher,
      JobExplorer jobExplorer, JobRepository jobRepository, BatchProperties properties) {
    JobLauncherApplicationRunner runner =
        new JobLauncherApplicationRunner(jobLauncher, jobExplorer, jobRepository);
    String jobNames = properties.getJob().getNames();
    if (StringUtils.hasText(jobNames)) {
      runner.setJobNames(jobNames);
    } else {
      runner.setJobNames("dummy");
    }
    return runner;
  }

  @Bean
  AuditingProvider auditingProvider() {
    return new BatchAuditingProvider();
  }

  @Bean
  @JobScope
  public LoggingJobExecutionListener loggingJobExecutionListener() {
    return new LoggingJobExecutionListener();
  }

  @Bean
  @JobScope
  public LoggingStepExecutionListener loggingStepExecutionListener() {
    return new LoggingStepExecutionListener();
  }

  /**
   * onContextRefreshedEvent.
   * <p>
   * 参考：<a href=
   * "https://github.com/codecentric/spring-boot-starter-batch-web">codecentric/spring-boot-starter-batch-web</a>
   * </p>
   *
   * @param event ContextRefreshedEvent
   */
  @EventListener
  @Order
  public void onContextRefreshedEvent(ContextRefreshedEvent event) {

    jobRegistry.getJobNames().forEach(jobName -> {
      Job job = getJob(jobName);
      if (job instanceof AbstractJob) {
        AbstractJob abstractJob = (AbstractJob) job;
        abstractJob.registerJobExecutionListener(loggingJobExecutionListener());
        abstractJob.getStepNames().forEach(stepName -> {
          Step step = abstractJob.getStep(stepName);
          if (step instanceof AbstractStep) {
            AbstractStep abstractStep = (AbstractStep) step;
            abstractStep.registerStepExecutionListener(loggingStepExecutionListener());
          }
        });
      }
    });
  }

  @SneakyThrows
  private Job getJob(String jobName) {
    Job job = jobRegistry.getJob(jobName);
    return job;
  }

  @Bean
  public ApplicationContextFactory importUserJob() {
    return new GenericApplicationContextFactory(ImportUserJobConfiguration.class);
  }

  @Bean
  public ApplicationContextFactory importAdAddress() {
    return new GenericApplicationContextFactory(ImportAdAddressConfiguration.class);
  }

}
