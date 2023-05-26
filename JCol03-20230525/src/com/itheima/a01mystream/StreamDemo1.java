package com.itheima.a01mystream;

import java.util.ArrayList;

/**
 * @author Steven
 * @ClassName StreamDemo1.java
 * @Description
 * @createTime 2023-05-25 11:19
 **/
public class StreamDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();

        list1.add("张无忌");
        list1.add("周芷若");
        list1.add("赵敏");
        list1.add("张强");
        list1.add("张三丰");

        list1.stream().filter(name->name.startsWith("张")).filter(name->name.length() == 3).forEach(name-> System.out.println(name));
    }
}
