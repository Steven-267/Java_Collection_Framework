package com.ittheima.mycollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author Steven
 * @ClassName A04_CollectionDemo4.java
 * @Description
 * @createTime 2023-05-14 19:11
 **/
// TODO:迭代器的细节注意点
//        1.报错NoSuchElementException
//        2.迭代器遍历完毕，指针不会复位
//        3.循环中只能用一次next方法
//        4.迭代器遍历时，不能用集合的方法进行增加或者删除
public class A05_CollectionDemo5 {
    public static void main(String[] args) {
        //1.创建集合并添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");
        coll.add("eee");

        //2.获取迭代器对象
        Iterator<String> it = coll.iterator();
        //3.使用循环不断的去获取集合中的每一个元素
        while (it.hasNext()) {
            //4.next方法的两件事：获取元素并移动指针
            System.out.println(it.next());
        }

    }
}
