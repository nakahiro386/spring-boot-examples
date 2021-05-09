package io.github.nakahiro386.spring.boot.example.batch.item;

import io.github.nakahiro386.spring.boot.example.batch.dto.Person;
import io.github.nakahiro386.spring.boot.example.domain.entity.People;
import java.util.Locale;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.batch.item.ItemProcessor;

@Slf4j
public class PersonItemProcessor implements ItemProcessor<Person, People> {

  @Override
  public People process(Person person) throws Exception {
    final String firstName = StringUtils.upperCase(person.getFirstName(), Locale.getDefault());
    final String lastName = StringUtils.upperCase(person.getLastName(), Locale.getDefault());

    final People transformedPerson = new People().withFirstName(firstName).withLastName(lastName);

    log.info("Converting ({}) into ({})", person, transformedPerson);

    return transformedPerson;
  }

}
