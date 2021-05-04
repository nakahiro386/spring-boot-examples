package io.github.nakahiro386.spring.boot.example.fw.batch.domain.plugin;

import io.github.nakahiro386.spring.boot.example.fw.domain.plugin.AuditingProvider;
import java.util.Date;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.batch.core.scope.context.JobContext;
import org.springframework.batch.core.scope.context.JobSynchronizationManager;
import org.springframework.batch.core.scope.context.StepContext;
import org.springframework.batch.core.scope.context.StepSynchronizationManager;

@NoArgsConstructor
@Setter
public class BatchAuditingProvider implements AuditingProvider {
  public static String DEFAULT_CURRENT_AUDITOR = "BATCH";
  private String defaultCurrentAuditor = DEFAULT_CURRENT_AUDITOR;

  @Override
  public String getCurrentAuditor() {
    String currentAuditor = null;
    JobContext jobContext = JobSynchronizationManager.getContext();
    if (jobContext != null) {
      currentAuditor = jobContext.getJobName();

      StepContext stepContext = StepSynchronizationManager.getContext();
      if (stepContext != null) {
        currentAuditor += "_" + stepContext.getStepName();
      }
      currentAuditor += "_" + String.valueOf(jobContext.getJobExecution().getId());
    }
    return (currentAuditor != null) ? currentAuditor : defaultCurrentAuditor;
  }

  @Override
  public Date getCurrentTimeStamp() {
    return new Date();
  }

}
