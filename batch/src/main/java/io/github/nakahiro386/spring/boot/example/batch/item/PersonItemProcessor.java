package io.github.nakahiro386.spring.boot.example.batch.item;

import io.github.nakahiro386.spring.boot.example.batch.dto.Person;
import io.github.nakahiro386.spring.boot.example.domain.entity.People;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemProcessor;

@Slf4j
public class PersonItemProcessor implements ItemProcessor<Person, People> {

  @Override
  public People process(Person person) throws Exception {
    final String firstName = person.getFirstName().toUpperCase();
    final String lastName = person.getLastName().toUpperCase();

    final People transformedPerson = new People().withFirstName(firstName).withLastName(lastName);

    log.info("Converting ({}) into ({})", person, transformedPerson);

    return transformedPerson;
  }

}
