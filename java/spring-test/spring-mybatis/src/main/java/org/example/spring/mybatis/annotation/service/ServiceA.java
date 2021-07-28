package org.example.spring.mybatis.annotation.service;

import org.example.spring.mybatis.mapper.UserMapper;
import org.example.spring.mybatis.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

/**
 * @author liusenze
 * @Description:
 * @since 2021/7/16 11:23 上午
 */
@Service
public class ServiceA {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private ServiceB serviceB;

    @Transactional(rollbackFor = Exception.class)
    public void insertUser() throws IOException {
        User user =new User();
        user.setUsername("aaa");
        userMapper.insert(user);
        serviceB.insertUser();
        //throw new NullPointerException();
        throw new IOException();
    }

}
