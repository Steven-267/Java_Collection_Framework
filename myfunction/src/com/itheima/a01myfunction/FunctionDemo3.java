package com.itheima.a01myfunction;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Steven
 * @ClassName FunctionDemo3.java
 * @Description
 * @createTime 2023-05-29 22:06
 **/
public class FunctionDemo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list,"张无忌","周芷若","赵敏","张强","张三丰");

//        list.stream().filter(s->s.startsWith("张"))
//                .filter(s->s.length() == 3)
//                .forEach(s -> System.out.println(s));
//
        list.stream()
                 .filter(new StringOperation() :: stringJudge)
                .forEach(s -> System.out.println(s));


    }
}
