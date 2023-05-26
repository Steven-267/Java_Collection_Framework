package com.itheima.a01mystream;

import java.util.HashMap;

/**
 * @author Steven
 * @ClassName StreamDemo3.java
 * @Description 双列集合                 无                       无法直接使用stream流
 * @createTime 2023-05-25 15:14
 **/
public class StreamDemo3 {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();

        hm.put( "aaa",111);
        hm.put( "bbb",222);
        hm.put( "ccc" ,333);
        hm.put( "ddd" ,444);

        //第一种方法：通过键找值的方法
        //hm.keySet().stream().forEach(s -> System.out.println(s));

        //第二种方法：通过键值对找

        hm.entrySet().stream().forEach(s-> System.out.println(s));
    }





}
