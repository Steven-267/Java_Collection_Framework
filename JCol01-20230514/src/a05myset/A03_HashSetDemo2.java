package a05myset;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Steven
 * @ClassName A03_HashSetDemo2.java
 * @Description
 * 需求:创建一个存储学生对象的集合，存储多个学生对象。使用程序实现在控制台遍历该集合。
 * 要求:学生对象的成员变量值相同，我们就认为是同一个对象
 * @createTime 2023-05-21 14:27
 **/
public class A03_HashSetDemo2 {
    public static void main(String[] args) {
        //1.创建对象
        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("lisi",24);
        Student s3 = new Student("wangwu",25);
        Student s4 = new Student("zhangsan",23);

        //2.创建集合（实现去重，选用HashSet）
        Set<Student> stu = new  HashSet<>();

        //3.添加元素
        System.out.println(stu.add(s1));
        System.out.println(stu.add(s2));
        System.out.println(stu.add(s3));
        System.out.println(stu.add(s4));

        System.out.println(stu);
    }
}
