import com.alibaba.druid.pool.DruidDataSourceFactory;
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

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import java.util.Timer;

/**
 * @author liusenze
 * @Description:
 * @since 2021/6/2 10:30 下午
 */
public class TestApplication {


    /*static SqlSessionFactory sqlSessionFactory;

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
    }*/



    @Test
    public void testDruid() throws Exception {
        Properties properties=new Properties();
        InputStream is=this.getClass().getClassLoader().getResourceAsStream("druid.properties");
        properties.load(is);
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        Connection conn = dataSource.getConnection();
        Statement statement=conn.createStatement();
        ResultSet resultSet =statement.executeQuery("select * from testts");
        System.out.println(resultSet);
        resultSet.next();
        System.out.println(resultSet.getObject(1));
        resultSet.close();
        statement.close();
        conn.close();
    }


    @Test
    public void testMyBatisDruid() throws Exception {

        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession=sqlSessionFactory.openSession();

        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        System.out.println(userMapper.selectAll());

        sqlSession.close();
        sqlSession=sqlSessionFactory.openSession();
    }


    @Test
    public void testMyBatisDruid2() throws Exception {



        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);

        long t1=System.currentTimeMillis();

        for(int i=0;i<100;i++){
            new Thread(){
                @Override
                public void run() {
                    SqlSession sqlSession=sqlSessionFactory.openSession();
                    UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
                    userMapper.selectAll();
                    sqlSession.close();
                    System.out.println((System.currentTimeMillis()-t1)/1000.0);
                }
            }.start();
        }

        Thread.sleep(10000);
    }


}
