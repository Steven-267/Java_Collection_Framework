package com.itheima.a01mymap;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 * @author Steven
 * @ClassName A04_MapDemo4.java
 * @Description Map的第三种遍历方式 lamdba表达式
 * @createTime 2023-05-23 12:06
 **/
public class A04_MapDemo4 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        map.put("鲁迅","这句话是我说的");
        map.put("曹操","不可能绝对不可能");
        map.put("刘备","接着奏乐接着舞");
        map.put("柯镇恶","看我眼色行事");


        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key+"="+value);
            }
        });
        //利用lambda表达式进行遍历
        map.forEach((key,value)-> System.out.println(key+"="+value));
    }
}
