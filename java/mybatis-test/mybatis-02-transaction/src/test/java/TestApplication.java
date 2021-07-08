import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.mybatis.mapper.BossMapper;
import org.example.mybatis.mapper.UserMapper;
//import org.example.mybatis.pojo.Address;
import org.example.mybatis.pojo.Boss;
import org.example.mybatis.pojo.User;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author liusenze
 * @Description:
 * @since 2021/6/2 10:30 下午
 */
public class TestApplication {


    static SqlSessionFactory sqlSessionFactory;

    {
        //读取数据库配置信息和mapper信息，创建SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);
    }


    public static SqlSession getSession() throws IOException {
        //从SqlSessionFactory获取会话SqlSession
        SqlSession session = sqlSessionFactory.openSession();
        return session;
    }

    @Test
    public void test1() throws IOException {
        SqlSession session = getSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        //User user=userMapper.selectById(1);
        User user = userMapper.selectByIdForUpdate(1);
        user.setUsername(user.getUsername() + 2);
        userMapper.update(user);
        session.commit();
    }

    @Test
    public void test2() throws IOException {
        SqlSession session = getSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        //User user=userMapper.selectById(1);
        User user = userMapper.selectByIdForUpdate(1);
        user.setUsername(user.getUsername() + 3);
        userMapper.update(user);
        session.commit();
    }


    @Test
    public void testSecondaryCache() throws IOException {
        SqlSession session = getSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        //User user=userMapper.selectById(1);
        User user = userMapper.selectById(1);
        //必选先关会话才能存到二级缓存
        session.close();

        SqlSession session2 = getSession();
        userMapper = session2.getMapper(UserMapper.class);
        //User user=userMapper.selectById(1);
        user = userMapper.selectById(1);

    }

    @Test
    public void testCache() throws IOException {
        SqlSession session = getSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        BossMapper bossMapper = session.getMapper(BossMapper.class);
        //User user=userMapper.selectById(1);
        User user = userMapper.selectById(1);
        //user.setUsername("111");
        //userMapper.update(user);
        Boss boss = new Boss();
        boss.setId(2);
        boss.setName("222");
        bossMapper.insert(boss);
        user = userMapper.selectById(1);
        session.commit();
        //必选先关会话才能存到二级缓存
        session.close();


    }


    @Test
    public void testclassforName() {
        try {
            Class.forName("org.example.mybatis.pojo.Address");
            Class.forName("org.example.mybatis.pojo.Address");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
