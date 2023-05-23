package com.itheima.a01mymap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * @author Steven
 * @ClassName A05_HashMapDemo1.java
 * @Description 需求 :
 * 创建一个HashMap集合，键是学生对象(Student)，值是籍贯(String)。
 *  存储三个键值对元素，并遍历
 * 要求:同姓名，同年龄认为是同一个学生
 * @createTime 2023-05-23 14:55
 **/
public class A05_HashMapDemo1 {
    public static void main(String[] args) {
        HashMap<Student,String> map = new HashMap<>();

        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("lisi",24);
        Student s3 = new Student("wangwu",25);
        Student s4 = new Student("lisi",24);

        System.out.println(map.put(s1, "shantou"));
        System.out.println(map.put(s2, "guangzhou"));
        System.out.println(map.put(s3, "shenzheng"));
        System.out.println(map.put(s4, "hunan"));
        System.out.println("--------------------------------");
        //遍历
        //1.lambda表达式
    /*    map.forEach(new BiConsumer<Student, String>() {
            @Override
            public void accept(Student student, String s) {
                System.out.println(student.getName()+"come from"+" "+s);
            }
        });*/


        //2.键值对


        //Set<Map.Entry<Student, String>> e = map.entrySet();


        //2.1 lambda表达式遍历Set
      /*  e.forEach(new Consumer<Map.Entry<Student, String>>() {
            @Override
            public void accept(Map.Entry<Student, String> studentStringEntry) {
                System.out.println(studentStringEntry);
            }
        });*/
        //2.2增强for
      /*  for (Map.Entry<Student, String> studentStringEntry : e) {
            System.out.println(studentStringEntry);
        }*/
        //2.3迭代器
     /*   Iterator<Map.Entry<Student, String>> it = e.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }*/

        //3.键找值

        Set<Student> keys = map.keySet();
        keys.forEach(student-> {
                String pl = map.get(student);
                System.out.println(pl);
            }
        );

    }
}
