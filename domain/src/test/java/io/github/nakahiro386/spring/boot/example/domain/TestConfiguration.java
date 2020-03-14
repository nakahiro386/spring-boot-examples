package io.github.nakahiro386.spring.boot.example.domain;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Import;

@Import(DomainConfiguration.class)
// @SpringBootApplication の場合は配下のパッケージでアノテーションを探索する。
@SpringBootConfiguration
public class TestConfiguration {

}
