package io.github.nakahiro386.spring.boot.example.batch.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
  private String lastName;
  private String firstName;
}
