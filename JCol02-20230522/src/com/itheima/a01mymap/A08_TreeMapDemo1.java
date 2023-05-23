package com.itheima.a01mymap;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.function.BiConsumer;

/**
 * @author Steven
 * @ClassName A08_TreeMapDemo1.java
 * @Description
 * TreeMap集合:基本应用需求1:
 * 键:整数表示id
 * 值:字符串表示商品名称
 * 要求:按照id的升序排列、按照id的降序排列
 * @createTime 2023-05-23 21:57
 **/
public class A08_TreeMapDemo1 {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap = new TreeMap<Integer,String>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        treeMap.put(3,"zhangsan");
        treeMap.put(5,"wangwu");
        treeMap.put(4,"lisi");

        treeMap.forEach((integer,s)-> System.out.println(integer+"="+s)
        );

    }
}
