package com.ittheima.mycollection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Steven
 * @ClassName A01_CollectionDemo1.java
 * @Description
 * @createTime 2023-05-14 03:02
 **/
public class A01_CollectionDemo1 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();

        //1.添加元素
        //细节1：如果要往List集合中添加集合，那么永远返回true，因为List系列是允许元素重复的
        //细节2：如果要往Set方法里面添加元素 如果元素已经存在则返回false
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        System.out.println(coll);

        //2.清空
//        coll.clear();
//        System.out.println(coll);

        //3.删除
        //细节1：只能通过元素的对象进行删除不能通过索引删除
        //细节2：删除成功返回true失败返回false
        coll.remove("aaa");
        System.out.println(coll);

        //4.判断元素是否包含
        //细节1:底层是依赖equals方法进行判断是否存在的
        //如果集合中存放的是自定义的对象，那么再javabean中一定要对equals方法进行重写
        // 不然默认使用object类中的equals方法 即根据地址值进行判断
        //需求：属性一样 就可以
        boolean result = coll.contains("aaa");
        System.out.println(result);

        //5.判断集合是否为空
        boolean result2 = coll.isEmpty();
        System.out.println(result2);

        //6.获取集合的长度
        int length = coll.size();
        System.out.println(length);

    }
}
