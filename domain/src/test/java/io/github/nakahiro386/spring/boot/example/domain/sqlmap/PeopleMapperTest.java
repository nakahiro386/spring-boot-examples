package io.github.nakahiro386.spring.boot.example.domain.sqlmap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.github.springtestdbunit.annotation.ExpectedDatabase;
import com.github.springtestdbunit.assertion.DatabaseAssertionMode;
import io.github.nakahiro386.spring.boot.example.domain.entity.People;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.TestExecutionListeners.MergeMode;

@MybatisTest
@TestExecutionListeners(value = DbUnitTestExecutionListener.class,
    mergeMode = MergeMode.MERGE_WITH_DEFAULTS)
class PeopleMapperTest {

  @Autowired
  private PeopleMapper peopleMapper;

  @Test
  @DatabaseSetup("PeopleMapperTest_test1_setup.xml")
  void test1() {
    long count = peopleMapper.countByExample(null);
    assertEquals(0L, count);
  }

  @Test
  @DatabaseSetup("PeopleMapperTest_test2_setup.xml")
  @ExpectedDatabase(value = "PeopleMapperTest_test2_expected.xml",
      assertionMode = DatabaseAssertionMode.NON_STRICT)
  void test2() {
    People record = new People();
    record.setFirstName("firstName");
    record.setLastName("lastName");
    int key = peopleMapper.insert(record);
    assertNotEquals(0, key);
    People people = peopleMapper.selectByPrimaryKey(record.getId());
    assertEquals(record, people);

    people.withFirstName("foo").withLastName("bar");
    int count = peopleMapper.updateByPrimaryKey(people);
    assertEquals(1, count);

    people = peopleMapper.selectByPrimaryKey(record.getId());
    assertEquals("foo", people.getFirstName());
    assertEquals("bar", people.getLastName());
    assertEquals(2, people.getVersion());

    count = peopleMapper.updateByPrimaryKey(people);
    people = peopleMapper.selectByPrimaryKey(record.getId());
    assertEquals(3, people.getVersion());
  }

}
