package org.example.spring.mybatis.mapper;

import org.example.spring.mybatis.pojo.User;

import java.util.List;

/**
 * @author liusenze
 * @Description:
 * @since 2021/6/8 5:12 下午
 */
public interface UserMapper {
    List<User> selectAll();
}
