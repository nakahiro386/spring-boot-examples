package io.github.nakahiro386.spring.boot.example.batch.configuration;

import lombok.Setter;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.beans.factory.annotation.Autowired;

@Setter(onMethod_ = {@Autowired})
public abstract class AbstractJobConfiguration {
  protected JobBuilderFactory jobBuilderFactory;
  protected StepBuilderFactory stepBuilderFactory;
  protected SqlSessionFactory sqlSessionFactory;
}
