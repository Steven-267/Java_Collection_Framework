package com.itheima.a01mymap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

/**
 * @author Steven
 * @ClassName A02_MapDemo2.java
 * @DescriptionMap的遍历方式演示键找值
 * @createTime 2023-05-22 22:30
 **/
public class A02_MapDemo2 {
    public static void main(String[] args) {
        //第一种遍历方式

        //1.创建Map集合对象
        Map<String,String> map = new HashMap<>();

        //2.添加元素
        map.put("韦小宝","沐剑屏");
        map.put("尹志平","小龙女");

        //3.通过键找值

        //3.1获取所有的键，把这些键放到一个单链集合种
        Set<String> keys = map.keySet();//返回值是一个Set<String>集合
        //3.2遍历单列集合，得到每一个键

        //lambda表达式
        /*  keys.forEach((s)->{
//            System.out.println(s);

            //3.3利用map集合种的键获取对应的值   get
            String value = map.get(s);
            System.out.println(s+"="+value);
        });*/

/*        //增强for
        for (String key : keys) {
            System.out.println(key);
            String s = map.get(key);
            System.out.println(key+"="+s);
        }*/

/*        //迭代器
        Iterator<String> iterator = keys.iterator();
        while(iterator.hasNext()){
            String i = iterator.next();
            System.out.println(i);
            String s = map.get(i);
            System.out.println(i+"="+s);

        }*/

    }
}
