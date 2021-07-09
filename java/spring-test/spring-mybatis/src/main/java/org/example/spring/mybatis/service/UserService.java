package org.example.spring.mybatis.service;


import lombok.Data;
import org.example.spring.mybatis.mapper.UserMapper;
import org.example.spring.mybatis.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;

@Data
public class UserService  {

    @Autowired
    private UserMapper userMapper;

    public void test() throws Exception {
        User user=new User();
        user.setUsername("asada");
        userMapper.insert(user);
        int c=0;
        int i=1/c;
        user.setUsername("qwer");
        userMapper.insert(user);
    }
}
