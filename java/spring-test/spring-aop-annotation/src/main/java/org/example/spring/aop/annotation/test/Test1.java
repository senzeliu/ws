package org.example.spring.aop.annotation.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author liusenze
 * @Description:
 * @since 2021/7/8 8:15 下午
 */
@Component
public class Test1 implements Tes{

    @Value("sss")
    private String ss;
    public void test() {
        System.out.println("this is userservice 1 "+ss);
    }
}
