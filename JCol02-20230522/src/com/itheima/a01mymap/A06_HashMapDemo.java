package com.itheima.a01mymap;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Steven
 * @ClassName A06_HashMapDemo.java
 * @Description 需求
 * 某个班级80名学生，现在需要组成秋游活动，班长提供了四个景点依次是A、B、c、D),每个学生只
 * 能选择一个景点，请统计出最终哪个景点想去的人数最多。
 * @createTime 2023-05-23 15:39
 **/
public class A06_HashMapDemo {
    public static void main(String[] args) {

         String[] s = {"A","b","c","d"};

        ArrayList<String> list = new ArrayList<String>();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(s.length);
            list.add(s[index]);
        }




    }
}
