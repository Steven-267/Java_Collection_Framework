package com.itheima.a01mystream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Steven
 * @ClassName streamDemo12.java
 * @Description
 * 创建一个ArrayList集合，并添加以下字符串，字符串中前面是姓名，后面是年龄"zhangsan，23","lisi，24","wangwu，25"
 * 保留年龄大于等于24岁的人，并将结果收集到Map集合中，姓名为键，年龄为值
 * @createTime 2023-05-25 18:14
 **/
public class streamDemo12 {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<String>();

        Collections.addAll(list,"zhangsan,23","lisi,24","wangwu,25");

        Map<String, Integer> map = list.stream()
                .filter(s -> Integer.parseInt(s.split(",")[1]) >= 24)
                .collect(Collectors.toMap(
                        s -> s.split(",")[0],
                        s -> Integer.parseInt(s.split(",")[1])
                ));
        System.out.println(map);
    }

}
