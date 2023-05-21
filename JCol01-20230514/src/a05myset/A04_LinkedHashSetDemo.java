package a05myset;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/**
 * @author Steven
 * @ClassName A04_LinkedHashSetDemo.java
 * @Description
 * @createTime 2023-05-21 14:39
 **/
public class A04_LinkedHashSetDemo {
    public static void main(String[] args) {
        //1.创建学生对象
        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("lisi",24);
        Student s3 = new Student("wangwu",25);
        Student s4 = new Student("zhangsan",23);
        //2.创建集合对象
        LinkedHashSet<Student> lhs = new LinkedHashSet<>();

        //3.添加元素
        System.out.println(lhs.add(s1));
        System.out.println(lhs.add(s2));
        System.out.println(lhs.add(s3));
        System.out.println(lhs.add(s4));

        //4.添加集合
        System.out.println(lhs);




    }
}
