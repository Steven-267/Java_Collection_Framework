package com.itheima.a01mystream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

/**
 * @author Steven
 * @ClassName streamDemo9.java
 * @Description
 * @createTime 2023-05-25 16:23
 **/
/*
void forEach(Consumer action)
遍历
long count()
统计
toArray()
收集流中的数据，放到数组中
*/

public class streamDemo9 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无","周芷若","赵敏","张强","张三丰","张翠山","张良","王二麻子","谢广坤");


/*        long count = list.stream().count();
        System.out.println(count);*/

        /*String[] strings = list.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });
        System.out.println(Arrays.toString(strings));*/

        System.out.println(Arrays.toString(list.stream().toArray(value -> new String[value])));
    }
}
