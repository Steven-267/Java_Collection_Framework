package a05myset;

import java.util.Objects;

/**
 * @author Steven
 * @ClassName Student.java
 * @Description
 * @createTime 2023-05-21 14:01
 **/
public class Student implements Comparable<Student> {

    private String name;
    private int age;


    public Student() {
    }



    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }

    @Override
    public int compareTo(Student o) {
        //指定排序的规则
        //只看年龄，我想要按照年龄的升序进行排列
        int i = this.getAge()- o.getAge();
        return i;
    }
}
