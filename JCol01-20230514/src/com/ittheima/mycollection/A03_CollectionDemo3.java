package com.ittheima.mycollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author Steven
 * @ClassName A03_ColletionDemo3.java
 * @Description
 * @createTime 2023-05-14 18:49
 **/
public class A03_CollectionDemo3 {
    public static void main(String[] args) {
        //1.创建集合并添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");

        //2.获取迭代器对象
        Iterator<String> it = coll.iterator();
        //3.使用循环不断的去获取集合中的每一个元素
        while(it.hasNext()){
            //4.next方法的两件事：获取元素并移动指针
            String str = it.next();
            System.out.println(str);
        }
    }
}
