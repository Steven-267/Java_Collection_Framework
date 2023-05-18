package a05myset;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Steven
 * @ClassName A01_SetDemo1.java
 * @Description
 * 利用set系列的集合，添加字符串，并使用多种方式遍历。
 * 迭代器
 * 增强for
 * lambda表达式
 *
 * @createTime 2023-05-17 20:02
 **/
public class A01_SetDemo1 {
    public static void main(String[] args) {
        //1.创建一个set集合的对象
        Set<String> s = new HashSet<>();

        //2.添加元素
        boolean r1 = s.add("zhangsan");
        boolean r2 = s.add("zhangsan");
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(s);
    }
}
