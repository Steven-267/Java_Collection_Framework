package com.ittheima.mycollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

/**
 * @author Steven
 * @ClassName A07_CollectionDemo7.java
 * @Description
 * @createTime 2023-05-14 19:46
 **/
public class A07_CollectionDemo7 {
    public static void main(String[] args) {
        //1.创建一个集合并添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("a");
        coll.add("b");
        coll.add("c");

        //2.利用匿名内部类的形式
//        coll.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });



        //3.Lambda表达式
        //()->{}
        // coll.forEach((String s)->{
        //    System.out.println(s);
        //  });
        coll.forEach(s-> System.out.println(s));

    }
}
