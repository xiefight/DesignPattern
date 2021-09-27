package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Description:
 * @Author: xietao
 * @Date: 2021-09-26 09:40
 **/
public class TestLambda {

    public static void main(String[] args) {

        /*Map<String,String> map1 = new HashMap<>(8);
        map1.put("n","a");

        Map<String,String> map2 = new HashMap<>();

        map2.putAll(map1);
        System.out.println(map2 == map1);*/

        List<Map<String,String>> list = new ArrayList<>();
        Map<String,String> map1 = new HashMap<>(8);
        map1.put("n","a");
        map1.put("s","1");
        Map<String,String> map2 = new HashMap<>(8);
        map2.put("n","b");
        map2.put("s","2");
        Map<String,String> map3 = new HashMap<>(8);
        map3.put("n","c");
        map3.put("s","3");
        Map<String,String> map4 = new HashMap<>(8);
        map4.put("n","d");
        map4.put("s","4");

        list.add(map1);
        list.add(map2);
        list.add(map3);
        list.add(map4);

        List<Map<String,String>> listTemp = new ArrayList();
        listTemp.addAll(list);

        System.out.println("before--list-->"+list);
        System.out.println("before--listTemp-->"+listTemp);

        Map<String, Map<String, String>> map = listTemp.stream().collect(Collectors.toMap(tag -> tag.remove("n"), tag -> tag));

        System.out.println("after--list-->"+list);
        System.out.println("after--listTemp-->"+listTemp);
        System.out.println("map-->"+map);

        /*Map<String,String> map5 = new HashMap<>(8);
        map5.put("f","f");

        List<String> collect1 = list.stream().filter(map -> "a".equals(map.get("n"))).map(map -> map.put("s", "1")).collect(Collectors.toList());
        System.out.println(collect1);

//        System.out.println(list);
//        List<Map<String, String>> collect2 = list.stream().filter(map -> "f".equals(map.get("n"))).map(map -> {map.put("f","f");return map;}).collect(Collectors.toList());
        List<Map<String, String>> collect2 = list.stream().filter(map -> "e".equals(map.get("n"))).map(map -> {
            System.out.println(map);map.putAll(map5);return map;}).collect(Collectors.toList());
//        List<Map<String, String>> collect2 = list.stream().filter(map -> "f".equals(map.get("n"))).collect(Collectors.toList());

        Stream<Map<String, String>> stream = list.stream().filter(map -> "e".equals(map.get("n")));


        System.out.println(collect2);*/

    }

}
