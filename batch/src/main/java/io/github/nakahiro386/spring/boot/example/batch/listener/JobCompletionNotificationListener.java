package io.github.nakahiro386.spring.boot.example.batch.listener;

import io.github.nakahiro386.spring.boot.example.batch.dto.Person;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class JobCompletionNotificationListener extends JobExecutionListenerSupport {
  private final JdbcTemplate jdbcTemplate;

  @Override
  public void afterJob(JobExecution jobExecution) {
    if (jobExecution.getStatus() == BatchStatus.COMPLETED) {
      log.info("!!! JOB FINISHED! Time to verify the results");

      jdbcTemplate
          .query("SELECT first_name, last_name FROM people",
              (rs, row) -> new Person(rs.getString(1), rs.getString(2)))
          .forEach(person -> log.info("Found <" + person + "> in the database."));
    }
  }
}
