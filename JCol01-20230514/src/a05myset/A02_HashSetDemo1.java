package a05myset;

/**
 * @author Steven
 * @ClassName A02_HashSetDemo1.java
 * @Description
 * @createTime 2023-05-21 14:01
 **/
public class A02_HashSetDemo1 {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("zhangsan",23);
//        Student s2 = new Student("lisi",24);
//        Student s3 = new Student("wangwu",25);
        System.out.println(s1.hashCode());//460141958/重写后  -1461067292

        System.out.println(s2.hashCode()); //1163157884/重写后-1461067292


    }
}
