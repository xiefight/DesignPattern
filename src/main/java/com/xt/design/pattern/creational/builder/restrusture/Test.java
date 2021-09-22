package com.xt.design.pattern.creational.builder.restrusture;

/**
 * @Description:
 * @Author: xietao
 * @Date: 2021-09-22 20:27
 **/
public class Test {

    public static void main(String[] args) {
        Builder builder = new Builder();
// 豪华欧式
        System.out.println(builder.levelOne(132.52D).getDetail());
// 轻奢⽥田园
        System.out.println(builder.levelTwo(98.25D).getDetail());
// 现代简约
        System.out.println(builder.levelThree(85.43D).getDetail());
    }

}
