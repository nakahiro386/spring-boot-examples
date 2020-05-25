package io.github.nakahiro386.spring.boot.example.fw.domain.plugin;

import io.github.nakahiro386.spring.boot.example.fw.domain.entity.AuditableEntity;
import java.util.Date;
import java.util.Properties;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.executor.parameter.ParameterHandler;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Signature;

@Intercepts({@Signature(type = Executor.class, method = "update",
    args = {MappedStatement.class, Object.class})})
public class AuditingInterceptor implements Interceptor {

  private AuditingProvider auditingProvider;

  /**
   * AuditingProviderを指定してインスタンスを作成します.
   *
   * @param auditingProvider AuditingProviderインスタンス
   */
  public void setAuditingProvider(AuditingProvider auditingProvider) {
    if (auditingProvider == null) {
      throw new IllegalArgumentException("AuditingProvider must not be null!");
    }
    this.auditingProvider = auditingProvider;
  }

  @Override
  public Object intercept(Invocation invocation) throws Throwable {
    return invocation.proceed();
  }

  @Override
  public Object plugin(Object target) {

    if (target instanceof ParameterHandler) {
      ParameterHandler paramHandler = (ParameterHandler) target;
      Object obj = paramHandler.getParameterObject();

      if (obj != null) {

        if (obj instanceof AuditableEntity) {

          Date currentTimeStamp = auditingProvider.getCurrentTimeStamp();
          String currentUser = auditingProvider.getCurrentAuditor();

          AuditableEntity auditable = (AuditableEntity) obj;
          if (auditable.getCreatedDate() == null) {
            auditable.setCreatedDate(currentTimeStamp);
            auditable.setCreatedBy(currentUser);
          }
          auditable.setLastModifiedBy(currentUser);
          auditable.setLastModifiedDate(currentTimeStamp);
          auditable.setVersion(auditable.getVersion() + 1);

        }

      }
    }
    return target;
  }

  @Override
  public void setProperties(Properties properties) {}

}
