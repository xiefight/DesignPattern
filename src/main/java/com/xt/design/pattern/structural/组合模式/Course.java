package com.xt.design.pattern.structural.组合模式;

/**
 * @Description: 课程
 * @Author: xietao
 * @Date: 2021-11-04 22:23
 **/
public class Course extends CatalogComponent {
    private String name;
    private double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    public double getPrice(CatalogComponent catalogComponent) {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println("Course Name:" + name + " Price:" + price);
    }
}
