package io.github.nakahiro386.spring.boot.example.batch.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;
import org.springframework.core.annotation.Order;

@Slf4j
@Order
public class LoggingJobExecutionListener extends JobExecutionListenerSupport {

  @Override
  public void beforeJob(JobExecution jobExecution) {
    if (log.isTraceEnabled()) {
      log.trace("{}", jobExecution);
    }
  }

  @Override
  public void afterJob(JobExecution jobExecution) {
    if (log.isTraceEnabled()) {
      log.trace("{}", jobExecution);
    }
  }

}
