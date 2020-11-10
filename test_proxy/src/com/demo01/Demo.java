package com.demo01;

/**
 * projectName:ssm
 *
 * @author: 三毛
 * time:2020/9/1115:28
 * description:
 */
public class Demo {
    public static void main(String[] args) {
        BuyInterface grilFrend = new GrilFrend();

        BoyFactory boyFactory = new BoyFactory();
        boyFactory.setObject(grilFrend);

        BuyInterface object = (BuyInterface) boyFactory.getObject();
        object.BuyDruik("冰红茶");

    }
}
