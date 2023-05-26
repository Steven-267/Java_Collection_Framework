package com.itheima.a01mystream;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Steven
 * @ClassName streamDemo6.java
 * @Description
 * @createTime 2023-05-25 15:31
 **/
public class streamDemo6 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list,"张无","周芷若","赵敏","张强","张三丰","张翠山","张良","王二麻子","谢广坤");


        //filter()
/*
        list.stream()
                .filter(name ->name.startsWith("张"))
                .filter(name->name.length() == 3)
                .forEach(s -> System.out.println(s));
*/


        //limit:获取前几个元素
        // skip：跳过前几个元素

        //"张无","周芷若","赵敏","张强","张三丰","张翠山","张良","王二麻子","谢广坤"
        list.stream().skip(3).limit(3).forEach(s-> System.out.println(s));
    }
}
