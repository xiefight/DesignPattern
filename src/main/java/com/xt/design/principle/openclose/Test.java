package com.xt.design.principle.openclose;

/**
 * @author xietao
 * @date 2021-08-25 22:54
 */
public class Test {

    public static void main(String[] args) {
        ICourse javaCourse = new JavaCourse(96,"Java课程",333d);
        //一般不用sout，因为里面有锁
        System.out.println("课程id："+javaCourse.getId()+" 课程名称："+javaCourse.getName()+" 课程费用："+javaCourse.getPrice());

        ICourse iDiscountCourse = new JavaDiscountCourse(97,"打折的Java课程",333d);
        JavaDiscountCourse javaDiscountCourse = (JavaDiscountCourse) iDiscountCourse;
        //获取原价和打折后的价格--原价可以不强转，因为父级接口中有，获取打折价格需要强转
        System.out.println("课程id："+javaDiscountCourse.getId()
                +" 课程名称："+javaDiscountCourse.getName()
                +" 课程原费用："+javaDiscountCourse.getPrice()
                +" 课程打折费用："+javaDiscountCourse.getDisCountPrice());
     }

}
