package org.example.spring.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.spring.common.service.UserService;
import org.example.spring.common.service.impl.UserServiceImpl;
import org.example.spring.mybatis.mapper.UserMapper;
import org.example.spring.mybatis.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author liusenze
 * @Description:
 * @since 2021/6/2 10:30 下午
 */
public class Application {

    public static void main(String[] args) throws IOException {

       /* String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession(true);

        UserMapper userMapper= session.getMapper(UserMapper.class);
        userMapper.selectAll().forEach(item-> System.out.println(item));*/

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper=applicationContext.getBean(UserMapper.class);
        userMapper.selectAll().forEach(item-> System.out.println(item));
    }
}
