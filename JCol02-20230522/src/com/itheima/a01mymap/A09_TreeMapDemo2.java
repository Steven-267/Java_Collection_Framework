package com.itheima.a01mymap;

import java.util.TreeMap;

/**
 * @author Steven
 * @ClassName A09_TreeMapDemo2.java
 * @Description
 * 需求2:
 * 键:学生对象
 * 值:籍贯
 * 要求:按照学生年龄的升序排列，年龄一样按照姓名的字母排列，同姓名年龄视为同一个人。
 * @createTime 2023-05-23 22:13
 **/
public class A09_TreeMapDemo2 {
    public static void main(String[] args) {
        TreeMap<Student,String> treeMap = new TreeMap<>();

        Student s1= new Student("zhangsan",23);
        Student s2 = new Student("lisi",24);
        Student s3 = new Student("wangwu",25);

        treeMap.put(s3,"beijing");
        treeMap.put(s1,"shantou");
        treeMap.put(s2,"shenzheng");

        System.out.println(treeMap);
    }
}
