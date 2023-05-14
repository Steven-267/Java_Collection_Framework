package com.ittheima.mycollection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Steven
 * @ClassName A06_CollectionDemo6.java
 * @Description
 * @createTime 2023-05-14 19:35
 **/
public class A06_CollectionDemo6 {
    public static void main(String[] args) {
        //1.创建集合并添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");

        //2.利用增强for进行遍历直接coll.for
        //注意点
        for (String s : coll) {
            System.out.println(s);
        }
    }
}
