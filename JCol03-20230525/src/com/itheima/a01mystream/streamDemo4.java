package com.itheima.a01mystream;

import java.util.Arrays;

/**
 * @author Steven
 * @ClassName streamDemo4.java
 * @Description 数组         public static <T> Stream<T> stream(T[]array)      Arrays工具类中的静态方法
 * @createTime 2023-05-25 15:19
 **/
public class streamDemo4 {
    public static void main(String[] args) {
        int[] arr = {1,2,564788,9,0,3,2,5,7,3};

        Arrays.stream(arr).forEach(s-> System.out.println(s));
    }
}
