package com.itheima.a01myfunction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

/**
 * @author Steven
 * @ClassName StringDemo5.java
 * @Description
 * @createTime 2023-05-30 10:39
 **/
public class StringDemo5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list,"a","b","c","d","e");

       /* list.stream().map(new Function<String, String>() {
            @Override
            public String apply(String s) {
                String result = s.toUpperCase();
                return result;
            }
        }).forEach(s-> System.out.println(s));*/

        list.stream().map(String::toUpperCase).forEach(s-> System.out.println(s));
    }
}
