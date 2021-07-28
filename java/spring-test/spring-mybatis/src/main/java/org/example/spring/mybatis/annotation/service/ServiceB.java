package org.example.spring.mybatis.annotation.service;

import org.example.spring.mybatis.mapper.UserMapper;
import org.example.spring.mybatis.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * @author liusenze
 * @Description:
 * @since 2021/7/16 11:23 上午
 */
@Service
public class ServiceB {

    @Autowired
    private UserMapper userMapper;

    public void insertUser() throws IOException {
        User user =new User();
        user.setUsername("bbb");
        userMapper.insert(user);
        //throw new IOException();
        //throw new NullPointerException();
    }

}
