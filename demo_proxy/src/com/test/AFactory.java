package com.test;

/**
 * projectName:ssm
 *
 * @author: 三毛
 * time:2020/9/515:09
 * description:  这个是a商场
 */
public class AFactory implements FactoryRule {
    @Override
    public void seleShop(String message) {
        System.out.println("生产" +message+"商品");
    }
}
