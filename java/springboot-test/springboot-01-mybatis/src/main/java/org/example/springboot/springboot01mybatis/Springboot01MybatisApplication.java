package org.example.springboot.springboot01mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.example.springboot.springboot01mybatis.mapper")
public class Springboot01MybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot01MybatisApplication.class, args);
    }

}
