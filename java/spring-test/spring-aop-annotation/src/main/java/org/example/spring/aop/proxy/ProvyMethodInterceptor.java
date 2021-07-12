package org.example.spring.aop.proxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProvyMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object object, Method method , Object[] args , MethodProxy methodProxy ) throws Throwable {
        System.out.println("before " + method.getName());
        methodProxy.invokeSuper(object, args);
        System.out.println("after " + method.getName());
        return null;
    }
}