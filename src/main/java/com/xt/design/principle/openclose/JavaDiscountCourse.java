package com.xt.design.principle.openclose;

/**
 * 新需求：要对java课程打折
 * 原方案1：在接口种添加打折方法，各个子类去实现
 * 原方案2：直接在需要进行打折的课程中的getPrice方法中进行打折处理
 *
 * 以上两个方案都对原代码进行了修改，违背了对修改关闭的原则
 * 所以我们采用方案3：
 * 写一个打折的类实现原课程类，重写需要的方法即可
 * @author xietao
 * @date 2021-08-25 23:03
 */
public class JavaDiscountCourse extends JavaCourse{
    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    //如果需要获取原价、打折后的价格，则可以使用下面的写法
    public Double getDisCountPrice(){
        return super.getPrice() * 0.8;
    }


}
