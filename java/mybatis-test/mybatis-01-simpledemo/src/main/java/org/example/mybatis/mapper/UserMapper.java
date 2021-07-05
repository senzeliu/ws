package org.example.mybatis.mapper;

import org.apache.ibatis.annotations.Select;
import org.example.mybatis.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author liusenze
 * @Description:
 * @since 2021/6/8 5:12 下午
 */
public interface UserMapper {

    List<User> selectAll();

    User selectById(int id);

    void insert(User user);

    void update(User user);

    void delete(int id);

    //map入参
    void insertMap(Map user);

    List<User> selectLike(String username);


    //注解
    @Select("select * from test_user")
    List<User> selectByAnnotatione(String username);

    List<User> selectAllWithBoss1();

    List<User> selectAllWithBoss2();

    List<User> selectAllWithBossAddress();
}
