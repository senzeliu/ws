package org.example.spring.mybatis.mapper;

import lombok.Data;
import org.apache.ibatis.session.SqlSession;
import org.example.spring.mybatis.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @author liusenze
 * @Description:
 * @since 2021/6/8 5:12 下午
 */
@Data
public class UserMapperImpl /*extends SqlSessionDaoSupport*/ implements UserMapper {

    private SqlSession sqlSession;

    public List<User> selectAll() {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        return userMapper.selectAll();
    }
}
