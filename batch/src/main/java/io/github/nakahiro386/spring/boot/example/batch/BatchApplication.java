package io.github.nakahiro386.spring.boot.example.batch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import io.github.nakahiro386.spring.boot.example.domain.DomainConfiguration;

@SpringBootApplication
@Import(DomainConfiguration.class)
public class BatchApplication {
    public static void main(String[] args) {
        System.exit(SpringApplication.exit(SpringApplication.run(BatchApplication.class, args)));
    }
}
