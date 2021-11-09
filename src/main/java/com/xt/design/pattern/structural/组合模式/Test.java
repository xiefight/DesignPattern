package com.xt.design.pattern.structural.组合模式;

/**
 * @Description:
 * @Author: xietao
 * @Date: 2021-11-04 22:30
 **/
public class Test {

    public static void main(String[] args) {

        CatalogComponent linuxCourse = new Course("Linux课程",11);
        CatalogComponent windowsCourse = new Course("windows课程",11);

        CatalogComponent javaCourseCatalog = new CourseCatalog("Java目录",2);
        CatalogComponent course1 = new Course("Java初级",100);
        CatalogComponent course2 = new Course("Java中级",200);
        CatalogComponent course3 = new Course("Java高级",300);

        javaCourseCatalog.add(course1);
        javaCourseCatalog.add(course2);
        javaCourseCatalog.add(course3);

        CatalogComponent imoocMainCourseCatalog = new CourseCatalog("慕课网主目录",1);
        imoocMainCourseCatalog.add(linuxCourse);
        imoocMainCourseCatalog.add(windowsCourse);
        imoocMainCourseCatalog.add(javaCourseCatalog);

        imoocMainCourseCatalog.print();


    }

}
