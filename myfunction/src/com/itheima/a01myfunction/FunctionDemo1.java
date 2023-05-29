package com.itheima.a01myfunction;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Steven
 * @ClassName FunctionDemo1.java
 * @Description
 * @createTime 2023-05-29 21:35
 **/
public class FunctionDemo1 {
    public static void main(String[] args) {

        //需求：创建一个数组，进行倒叙排列
        Integer[] arr = {3,5,4,1,6,2};
        //匿名内部类
//        Arrays.sort(arr, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        });


        //lambda表达式
//        Arrays.sort(arr,(o1,o2) -> o2 - o1);


        //方法引用
        Arrays.sort(arr, FunctionDemo1::subtraction);
        System.out.println(Arrays.toString(arr));
    }

    public static int subtraction(int nums1,int nums2){
        return nums2 - nums1;
    }
}
