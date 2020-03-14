package io.github.nakahiro386.spring.boot.example.domain.sqlmap;

import io.github.nakahiro386.spring.boot.example.domain.entity.People;
import io.github.nakahiro386.spring.boot.example.domain.entity.PeopleExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface PeopleMapper {
    long countByExample(PeopleExample example);

    int deleteByExample(PeopleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(People record);

    int insertSelective(People record);

    List<People> selectByExampleWithRowbounds(PeopleExample example, RowBounds rowBounds);

    List<People> selectByExample(PeopleExample example);

    People selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") People record, @Param("example") PeopleExample example);

    int updateByExample(@Param("record") People record, @Param("example") PeopleExample example);

    int updateByPrimaryKeySelective(People record);

    int updateByPrimaryKey(People record);
}