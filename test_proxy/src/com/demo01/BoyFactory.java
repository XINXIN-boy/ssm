package com.demo01;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * projectName:ssm
 *
 * @author: 三毛
 * time:2020/9/1115:26
 * description:
 */
public class BoyFactory implements InvocationHandler {
    private Object object ;


    public void setObject(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object invoke = method.invoke(object, args);
        return invoke;
    }

    public Object getObject(){
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(),this) ;
    }

}
//public class BoyFactory implements InvocationHandler {
//    private   Object factory ;
//
//    public  Object getFactory() {
//        return factory;
//    }
//
//    public  void setFactory(Object factory) {
//        this.factory = factory;
//    }
//
//    @Override
//    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        Object invoke = method.invoke(factory,args);
//        return invoke;
//    }
//
//    public  Object getProxy(){
//        return Proxy.newProxyInstance(factory.getClass().getClassLoader(),factory.getClass().getInterfaces() , this) ;
//    }
//
//}
