package com.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * projectName:ssm
 *
 * @author: 三毛
 * time:2020/9/515:13
 * description: 中间商代理
 */
public class FactoryProxy implements InvocationHandler {
     private   Object factory ;

    public  Object getFactory() {
        return factory;
    }

    public  void setFactory(Object factory) {
        this.factory = factory;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object invoke = method.invoke(factory,args);
        System.out.println("差唔到");
        return invoke;
    }

    public  Object getProxy(){
        return Proxy.newProxyInstance(factory.getClass().getClassLoader(),factory.getClass().getInterfaces() , this) ;
    }
}
