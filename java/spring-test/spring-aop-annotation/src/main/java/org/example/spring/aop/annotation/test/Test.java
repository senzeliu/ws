package org.example.spring.aop.annotation.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author liusenze
 * @Description:
 * @since 2021/7/8 8:15 下午
 */
@Component
public class Test {

    @Autowired
    @Qualifier("test1")
    private Tes tes;

    @Resource(name = "test2")
    private Tes te;

    @Value("sss")
    private String ss;
    public void test() {
        te.test();
        System.out.println("this is userservice "+ss);
    }
}
