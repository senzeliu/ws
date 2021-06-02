package org.example.spring.common.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author liusenze
 * @Description:
 * @since 2021/6/2 10:43 下午
 */
@Aspect
public class LogAnnotationAdvice {


    @Before("execution(* org.example.spring.common.service.impl.UserServiceImpl.*(..))")
    public void before()  {
        System.out.println("LogAnnotationAdvice 记录日志");
    }

}
