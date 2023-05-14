package com.ittheima.mycollection;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Steven
 * @ClassName A02_CollectionDemo.java
 * @Description
 * @createTime 2023-05-14 03:28
 **/
public class A02_CollectionDemo2 {
    public static void main(String[] args) {
        //1.创建集合对象
        Collection<Student> coll = new ArrayList<>();

        //2.创建集合数据
        Student s1 = new Student("zhansan",23);
        Student s2 = new Student("lisi",24);
        Student s3 = new Student("wangwu",25);

        //3.把数据添加到集合中
        coll.add(s1);
        coll.add(s2);
        coll.add(s3);

        //4.判断集合中某一个学生对象是否包含
        Student s4 = new Student("zhansan",23);
        System.out.println(coll.contains(s4));

    }

}
