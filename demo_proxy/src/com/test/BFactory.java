package com.test;

/**
 * projectName:ssm
 *
 * @author: 三毛
 * time:2020/9/515:23
 * description:
 */
public class BFactory implements FactoryRule {
    @Override
    public void seleShop(String message) {
        System.out.println("销毁" + message);

    }
}
