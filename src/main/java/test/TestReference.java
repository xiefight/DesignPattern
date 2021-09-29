package test;

/**
 * @Description: 测试引用
 * @Author: xietao
 * @Date: 2021-09-28 10:41
 **/
public class TestReference {

    public static void main(String[] args) {

        String a = "a";
        String b = a;

        System.out.println("a == "+a);
        System.out.println("b == "+b);


        a = "a1";

        System.out.println("a == "+a);
        System.out.println("b == "+b);

    }

}
