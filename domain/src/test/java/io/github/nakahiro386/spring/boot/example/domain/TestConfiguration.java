package io.github.nakahiro386.spring.boot.example.domain;

import io.github.nakahiro386.spring.boot.example.fw.domain.plugin.AuditingProvider;
import io.github.nakahiro386.spring.boot.example.fw.domain.plugin.DefaultAuditingProvider;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

@Import(DomainConfiguration.class)
// @SpringBootApplication の場合は配下のパッケージでアノテーションを探索する。
@SpringBootConfiguration
public class TestConfiguration {

  @Bean
  AuditingProvider auditingProvider() {
    AuditingProvider auditingProvider = new DefaultAuditingProvider();
    return auditingProvider;
  }
}
