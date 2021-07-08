package org.example.mybatis.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.datasource.DataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.Properties;

public class DruidDataSourceFactory implements DataSourceFactory {

    private Properties properties;

    @Override
    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public DataSource getDataSource() {
        Properties properties=new Properties();
        InputStream is=this.getClass().getClassLoader().getResourceAsStream("druid.properties");
        DataSource dataSource = null;
        try {
            properties.load(is);
            dataSource = com.alibaba.druid.pool.DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataSource;
    }
}