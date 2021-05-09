package io.github.nakahiro386.spring.boot.example.batch.configuration;

import io.github.nakahiro386.spring.boot.example.domain.DomainConfiguration;
import io.github.nakahiro386.spring.boot.example.fw.batch.domain.plugin.BatchAuditingProvider;
import io.github.nakahiro386.spring.boot.example.fw.domain.plugin.AuditingProvider;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.support.ApplicationContextFactory;
import org.springframework.batch.core.configuration.support.GenericApplicationContextFactory;
import org.springframework.batch.core.explore.JobExplorer;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.boot.autoconfigure.batch.JobLauncherApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.util.StringUtils;

@Configuration
@EnableBatchProcessing(modular = true)
@Import(DomainConfiguration.class)
public class BatchConfiguration {

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
  public ApplicationContextFactory importUserJob() {
    return new GenericApplicationContextFactory(ImportUserJobConfiguration.class);
  }

  @Bean
  public ApplicationContextFactory importAdAddress() {
    return new GenericApplicationContextFactory(ImportAdAddressConfiguration.class);
  }

}
