package org.example.springboot.springboot01mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.springboot.springboot01mybatis.pojo.TimeTest;
import org.springframework.stereotype.Repository;

import java.util.List;
//import org.example.springboot.springboot01mybatis.po.TimeTest;


/**
 * @author liusenze
 * @Description:
 * @since 2021/6/8 5:12 下午
 */
@Mapper
public interface TimeTestMapper {

    List<TimeTest> selectAll();

    void insert(TimeTest test);
}
