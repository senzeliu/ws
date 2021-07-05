package org.example.mybatis.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.example.mybatis.mapper.UserMapper;
import org.example.mybatis.pojo.User;
import org.example.mybatis.util.MyBatisUtil;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author liusenze
 * @Description:
 * @since 2021/6/21 10:00 下午
 */
public class UserMapperTest {


    @Test
    public void testInsert(){
        SqlSession sqlSession=MyBatisUtil.getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        User user=new User();
        user.setUsername("111");
        userMapper.insert(user);

        // 必须commit
        sqlSession.commit();
        sqlSession.close();
    }


    @Test
    public void testSelectById(){

        SqlSession sqlSession=MyBatisUtil.getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        User user=userMapper.selectById(2);
        System.out.println(user);
        sqlSession.close();
    }


    @Test
    public void testUpdate(){
        SqlSession sqlSession=MyBatisUtil.getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        User user=userMapper.selectById(2);
        user.setUsername("111222");
        userMapper.update(user);

        // 必须commit 否则更新修改不生效
        sqlSession.commit();
        sqlSession.close();
    }



    @Test
    public void testDelete(){
        SqlSession sqlSession=MyBatisUtil.getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        userMapper.delete(2);
        // 必须commit 否则不生效
        sqlSession.commit();
        sqlSession.close();
    }



    /**
     * map代替实体类入参 基本不用
     *
     * @Author liusenze
     * @Date 2021/6/21 10:17 下午
     * @param
     * @return void
     */
    @Test
    public void testInsertMap(){
        SqlSession sqlSession=MyBatisUtil.getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        Map user=new HashMap<>();
        user.put("username","111");
        userMapper.insertMap(user);
        //就算没有commit 当前事物还是能查到数据，但数据库是没有数据的
        userMapper.selectAll().forEach(item-> System.out.println(item));
        //必须commit
        sqlSession.commit();
        // 必须关闭
        sqlSession.close();
    }


    @Test
    public void testSelectLike(){

        SqlSession sqlSession=MyBatisUtil.getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        List<User> users=userMapper.selectLike("1");
        //System.out.println(users);
        users.forEach(item-> System.out.println(item));
        sqlSession.close();
    }


    @Test
    public void testLog4j(){
        Logger logger = Logger.getLogger(this.getClass());
        logger.error("error");
        logger.info("info");
        logger.debug("debug");
    }
}
