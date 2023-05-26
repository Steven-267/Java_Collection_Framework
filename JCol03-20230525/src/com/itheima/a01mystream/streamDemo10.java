package com.itheima.a01mystream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Steven
 * @ClassName streamDemo10.java
 * @createTime 2023-05-25 16:25
 **/
/*
collect(collector collector)
收集流中的数据，放到集合中
( List set Map)
*/

public class streamDemo10 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌-男-15","周芷若-女-14","赵敏-女-13","张强-男-20",
                "张三丰-男-100","张翠山-男-40","张良-男-35","王二麻子-男-37","谢广坤-男-41");


        //List
/*            List<String> newlist1 = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toList());

        System.out.println(newlist1);*/

        //Set
    /*    Set<String> newlist2 = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toSet());
        System.out.println(newlist2);*/

        //Map
        /*
*
toMap :参数一表示键的生成规则
参数二表示值的生成规则


*参数一:
*Function泛型一:表示流中每一个数据的类型
         泛型二:表示Map集合中键的数据类型
方法apply形参:依次表示流里面的每一个数据
            方法体:生成键的代码
            返回值:已经生成的键
*参数二;*
        Function
            泛型一:表示流中每一个数据的类型
*           泛型二:表示Map集合中值的数据类型
        方法apply形参:依次表示流里面的每一个数据
        * 方法体:生成值的代码
        * 返回值:已经生成的值
*/


     /*   Map<String, Integer> map = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toMap(new Function<String, String>() {

                                              @Override
                                              public String apply(String s) {
                                                  return s.split("-")[0];
                                              }
                                          }
                                ,
                                new Function<String, Integer>() {

                                    @Override
                                    public Integer apply(String s) {
                                        return Integer.parseInt(s.split("-")[2]);
                                    }
                                })


                );
        System.out.println(map);
*/
        Map<String, Integer> map = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect((Collectors.toMap(s-> s.split("-")[0],s-> Integer.parseInt(s.split("-")[2]))));
        System.out.println(map);
    }
}
