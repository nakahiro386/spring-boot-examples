package io.github.nakahiro386.spring.boot.example.domain;

import io.github.nakahiro386.spring.boot.example.fw.domain.plugin.AuditingInterceptor;
import io.github.nakahiro386.spring.boot.example.fw.domain.plugin.AuditingProvider;
import io.github.nakahiro386.spring.boot.example.fw.domain.plugin.DefaultAuditingProvider;
import org.apache.ibatis.plugin.Interceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackageClasses = DomainConfiguration.class)
public class DomainConfiguration {

  @Bean
  Interceptor auditingInterceptor() {
    AuditingProvider auditingProvider = new DefaultAuditingProvider();
    AuditingInterceptor auditingInterceptor = new AuditingInterceptor();
    auditingInterceptor.setAuditingProvider(auditingProvider);
    return auditingInterceptor;
  }
}
