package com.itheima.a01mystream;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Steven
 * @ClassName StreanmDemo2.java
 * @Description
 * 单列集合     default Stream<E> stream( )         collection中的默认方法
 * @createTime 2023-05-25 15:10
 **/
public class StreamDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list,"a","b", "c", "d" , "e");

        list.stream().forEach(s -> System.out.println(s));

    }
}
