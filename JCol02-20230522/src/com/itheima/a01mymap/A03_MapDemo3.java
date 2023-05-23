package com.itheima.a01mymap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Steven
 * @ClassName A03_MapDemo3.java
 * @Description
 * Map的遍历方式演示键值对
 * @createTime 2023-05-23 11:41
 **/
public class A03_MapDemo3 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        map.put("标枪选手","马超");
        map.put("人物挂件","明世隐");
        map.put("御龙骑士","尹志平");

        //3.Map集合的第二种遍历方法
        //通过键值对对象进行遍历
        //3.1通过一个方法（entrySet（））获取所有的键值对对象
        //原理：把每一对键值对对象放到一个Set集合中，再通过getvalue（）和getkey（）两个方法分别获取键和值
        Set<Map.Entry<String, String>> entries = map.entrySet();

  /*      //增强for
        for (Map.Entry<String, String> entry : entries) {
            //System.out.println(entry);
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"="+value);

        }*/
/*
        //迭代器
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while(iterator.hasNext()){
            Map.Entry<String, String> next = iterator.next();
            //System.out.println(next);
            String key = next.getKey();
            String value = next.getValue();
            System.out.println(key+"="+value);
        }
*/
/*
        //lambda表达式
        entries.forEach(s-> {
            String key = s.getKey();
            String value = s.getValue();
            System.out.println(key+"="+value);
        });
*/



    }
}
