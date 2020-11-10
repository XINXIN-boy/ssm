package com.test;

import java.util.Base64;

/**
 * projectName:ssm
 *
 * @author: 三毛
 * time:2020/9/515:13
 * description:
 */
public class ErGoouZi {
    public static void main(String[] args) {

        FactoryProxy factoryProxy = new FactoryProxy();

        AFactory aFactory = new AFactory();
        factoryProxy.setFactory(aFactory);
        FactoryRule proxy = (FactoryRule) factoryProxy.getProxy();

        proxy.seleShop("带向");

        BFactory bFactory = new BFactory();
        factoryProxy.setFactory(bFactory);
        FactoryRule proxy1 = (FactoryRule) factoryProxy.getProxy();
        proxy1.seleShop("四四");
    }
}
