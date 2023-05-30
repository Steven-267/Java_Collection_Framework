package com.itheima.a01myfunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

/**
 * @author Steven
 * @ClassName FunctionDemo6.java
 * @Description
 * @createTime 2023-05-30 10:42
 **/
public class FunctionDemo6 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5);

       Integer[] arr = list.stream().toArray(Integer[]::new);
        
/*        Integer[] arr= list.stream().toArray(new IntFunction<Integer[]>() {
            @Override
            public Integer[] apply(int value) {
                return new Integer[value];
            }
        });*/
        System.out.println(Arrays.toString(arr));

    }
}
