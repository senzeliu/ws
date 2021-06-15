package org.example.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.mybatis.mapper.UserMapper;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author liusenze
 * @Description:
 * @since 2021/6/2 10:30 下午
 */
public class Application {

    public static void main(String[] args) throws IOException {

        //读取数据库配置信息和mapper信息，创建SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);
        //从SqlSessionFactory获取会话SqlSession
        SqlSession session = sqlSessionFactory.openSession(true);
        //从SqlSessionFactory获取代理mapper对象
        UserMapper userMapper= session.getMapper(UserMapper.class);
        //mapper操作数据库
        userMapper.selectAll().forEach(item-> System.out.println(item));


        /*userMapper.insert();*/


    }
}
