package io.github.nakahiro386.spring.boot.example.batch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BatchApplication {

  public static void main(String[] args) {
    System.exit(SpringApplication.exit(SpringApplication.run(BatchApplication.class, args)));
  }

}
