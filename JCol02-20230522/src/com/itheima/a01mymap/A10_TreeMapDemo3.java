package com.itheima.a01mymap;

import java.util.TreeMap;

/**
 * @author Steven
 * @ClassName A10_TreeMapDemo3.java
 * @Description
 * 需求:字符串“aababcabcdabcde"
 * 请统计字符串中每一个字符出现的次数，并按照以下格式输出输出结果:
 * a (5) b ( 4) c ( 3) d (2) e ( 1)
 * @createTime 2023-05-23 22:29
 **/
public class A10_TreeMapDemo3 {
    public static void main(String[] args) {
        String s ="aababcabcdabcde";
        TreeMap<Character,Integer> map = new TreeMap<>();


        for (int i = 0; i < s.length();i++) {
             char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        map.forEach((key,value)-> System.out.print(key+"("+value+")"+" "));

    }
}
