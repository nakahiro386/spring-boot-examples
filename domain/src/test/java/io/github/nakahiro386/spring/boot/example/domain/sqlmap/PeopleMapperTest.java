package io.github.nakahiro386.spring.boot.example.domain.sqlmap;

import static org.junit.jupiter.api.Assertions.*;
import io.github.nakahiro386.spring.boot.example.domain.entity.People;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;

@MybatisTest
class PeopleMapperTest {

  @Autowired
  private PeopleMapper peopleMapper;

  @Test
  void test1() {
    System.out.println(peopleMapper);
    long count = peopleMapper.countByExample(null);
    assertEquals(0L, count);
  }

  @Test
  void test2() {
    People record = new People();
    record.setFirstName("firstName");
    record.setLastName("lastName");
    int key = peopleMapper.insert(record);
    assertNotEquals(0, key);
    People people = peopleMapper.selectByPrimaryKey(record.getId());
    System.out.println(people);

    people.withFirstName("foo").withLastName("bar");
    int count = peopleMapper.updateByPrimaryKey(people);
    assertEquals(1, count);
    System.out.println(people);
    count = peopleMapper.updateByPrimaryKey(people);
    assertEquals(1, count);
    System.out.println(people);
  }

}
