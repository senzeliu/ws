package org.example.spring.common.aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author liusenze
 * @Description:
 * @since 2021/6/2 10:43 下午
 */
public class LogAdvice  {
    public void before()  {
        System.out.println("记录日志");
    }
}
