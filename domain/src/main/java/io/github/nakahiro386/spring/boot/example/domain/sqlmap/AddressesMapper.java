package io.github.nakahiro386.spring.boot.example.domain.sqlmap;

import io.github.nakahiro386.spring.boot.example.domain.entity.Addresses;
import io.github.nakahiro386.spring.boot.example.domain.entity.AddressesExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface AddressesMapper {
    long countByExample(AddressesExample example);

    int deleteByExample(AddressesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Addresses record);

    int insertSelective(Addresses record);

    List<Addresses> selectByExampleWithRowbounds(AddressesExample example, RowBounds rowBounds);

    List<Addresses> selectByExample(AddressesExample example);

    Addresses selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Addresses record, @Param("example") AddressesExample example);

    int updateByExample(@Param("record") Addresses record, @Param("example") AddressesExample example);

    int updateByPrimaryKeySelective(Addresses record);

    int updateByPrimaryKey(Addresses record);
}