package test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 测试for循环中List的add和remove方法
 * @Author: xietao
 * @Date: 2021-10-12 08:26
 **/
public class TestListAddRemove {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        //把元素放到list里面去
        for (int i = 0 ; i < 10 ; i++ ) {
            list.add(i + "");
        }
        for (String s: list) {
            if ("5".equals(s)){
                list.remove(5);
            }
            System.out.println(s);
        }
    }

}
