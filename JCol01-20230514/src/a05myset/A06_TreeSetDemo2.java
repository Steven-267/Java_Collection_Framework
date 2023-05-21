package a05myset;

import java.util.TreeSet;

/**
 * @author Steven
 * @ClassName A05_TreeSetDemo2.java
 * @Description
 * 需求: 创建TreeSet集合，并添加3个学生对象学生对象属性:
 * 姓名，年龄。
 * 要求按照学生的年龄进行排序同年龄按照姓名字母排列(暂不考虑中文)同姓名，同年龄认为是同一个人
 *
 * @createTime 2023-05-21 15:52
 **/
public class A06_TreeSetDemo2 {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("lisi",24);
        Student s3 = new Student("wangwu",25);

        TreeSet<Student> ts = new TreeSet<Student>();

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);

        for (Student t : ts) {
            System.out.println(t);
        }

    }
}
