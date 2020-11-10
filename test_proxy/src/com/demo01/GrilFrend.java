package com.demo01;

/**
 * projectName:ssm
 *
 * @author: 三毛
 * time:2020/9/1115:25
 * description:
 */
public class GrilFrend implements BuyInterface {
    @Override
    public void BuyDruik(String message) {
        System.out.println("买" + message);
    }
}
