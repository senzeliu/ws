package org.example.spring.aop.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author liusenze
 * @Description:
 * @since 2021/7/12 2:44 下午
 */
public class ProxyInvoactionHandler implements InvocationHandler {
    private Subject subject;
    public ProxyInvoactionHandler(Subject subject) {
        this.subject = subject;
    }
    
    public Subject getProxy() {
        return (Subject)Proxy.newProxyInstance(this.getClass().getClassLoader(), subject.getClass().getInterfaces(),
            this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理前");
        // 这个h是拿不到的，所以只能用subject
        //method.invoke(((ProxyInvoactionHandler) ((Proxy) proxy).h).subject,args);
        method.invoke(subject,args);
        System.out.println("代理后");
        return null;
    }
}
