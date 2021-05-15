package io.github.nakahiro386.spring.boot.example.batch.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.listener.StepExecutionListenerSupport;
import org.springframework.core.annotation.Order;

@Slf4j
@Order
public class LoggingStepExecutionListener extends StepExecutionListenerSupport {
  @Override
  public void beforeStep(StepExecution stepExecution) {
    if (log.isTraceEnabled()) {
      log.trace("{}", stepExecution);
    }
  }

  @Override
  public ExitStatus afterStep(StepExecution stepExecution) {
    if (log.isTraceEnabled()) {
      log.trace("{}", stepExecution);
    }
    return super.afterStep(stepExecution);
  }

}
