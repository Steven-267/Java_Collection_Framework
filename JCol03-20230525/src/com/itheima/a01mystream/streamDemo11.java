package com.itheima.a01mystream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Steven
 * @ClassName streamDemo11.java
 * @Description
 * 定义一个集合，并添加一些整数1，2，3，4，5，6，7，8，9，10过滤奇数，只留下偶数。
 * 并将结果保存起来
 * @createTime 2023-05-25 18:08
 **/
public class streamDemo11 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Collections.addAll(list,1,2,3,4,5,6,7,8,9,10);

        List<Integer> newList = list.stream().filter(s -> s % 2 == 0).collect(Collectors.toList());

        System.out.println(newList);

    }
}
