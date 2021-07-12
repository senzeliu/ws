package org.example.spring.aop.proxy;

import net.sf.cglib.proxy.Enhancer;

import java.lang.reflect.Proxy;

/**
 * @author liusenze
 * @Description:
 * @since 2021/7/12 2:46 下午
 */
public class Client {

    public static void main(String[] args) {
        ProxyInvoactionHandler proxyInvoactionHandler = new ProxyInvoactionHandler(new SubjectImpl());
        //获取代理类
        /*Subject subject = (Subject)Proxy.newProxyInstance(proxyInvoactionHandler.getClass().getClassLoader(),
                SubjectImpl.class.getInterfaces(), proxyInvoactionHandler);*/
        Subject subject =proxyInvoactionHandler.getProxy();
        subject.test();


        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(SubjectImpl.class);
        enhancer.setCallback(new ProvyMethodInterceptor());
        SubjectImpl subject1= (SubjectImpl) enhancer.create();
        subject1.test();

    }
}
