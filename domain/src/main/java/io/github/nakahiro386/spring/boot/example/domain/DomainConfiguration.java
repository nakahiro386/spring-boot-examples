package io.github.nakahiro386.spring.boot.example.domain;

import io.github.nakahiro386.spring.boot.example.fw.domain.plugin.AuditingInterceptor;
import io.github.nakahiro386.spring.boot.example.fw.domain.plugin.AuditingProvider;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackageClasses = DomainConfiguration.class)
public class DomainConfiguration {

  // @Bean
  // AuditingProvider auditingProvider() {
  // AuditingProvider auditingProvider = new DefaultAuditingProvider();
  // return auditingProvider;
  // }

  @Bean
  AuditingInterceptor auditingInterceptor(AuditingProvider auditingProvider) {
    AuditingInterceptor auditingInterceptor = new AuditingInterceptor(auditingProvider);
    return auditingInterceptor;
  }
}
