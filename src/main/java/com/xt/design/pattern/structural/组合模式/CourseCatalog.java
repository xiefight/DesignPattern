package com.xt.design.pattern.structural.组合模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 课程目录
 * @Author: xietao
 * @Date: 2021-11-04 22:25
 **/
public class CourseCatalog extends CatalogComponent {

    //目录中的课程目录
    private List<CatalogComponent> items = new ArrayList<>();

    //目录的名称
    private String name;
    //目录级别
    private Integer level;

    public CourseCatalog(String name,Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(CatalogComponent catalogComponent) {
        items.add(catalogComponent);
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        items.remove(catalogComponent);
    }

    @Override
    public void print() {
        System.out.println(this.name);
        for (CatalogComponent catalogComponent : items) {
            //分级
            if (this.level != null){
                for (int i=0;i<this.level;i++){
                    System.out.print("--");
                }
            }
            catalogComponent.print();
        }
    }
}
