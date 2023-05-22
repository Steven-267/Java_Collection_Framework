package com.itheima.a01mymap;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Steven
 * @ClassName A01_MapDemo1.java
 * @Description
 * V put(K key,V value)添加元素
 * V remove(Object key )根据键删除键值对元素
 * void clear()移除所有的键值对元素
 * boolean containsKey(Object key)判断集合是否包含指定的键判断集合是否包含指定的值
 * boolean containsValue(Object value)判断集合是否为空
 * boolean isEmpty()int size()集合的长度，也就是集合中键值对的个数
 * @createTime 2023-05-22 20:55
 **/
public class A01_MapDemo1 {
    public static void main(String[] args) {

        //1.创建Map集合的对象
        Map<String,String> m = new HashMap<>();

        //2.添加元素
        String value = m.put("郭靖","黄蓉");
        m.put("韦小宝","沐剑屏");
        m.put("尹志平","小龙女");

/*        String result = m.remove("郭靖");//黄蓉
        System.out.println(result);*/

        //清空
        //m.clear();

        //判断是否包含
 /*        boolean KeyResult = m.containsKey("郭靖");
        System.out.println(KeyResult);

        boolean ValueResult = m.containsValue("小龙女");
        System.out.println(ValueResult);
*/

        //判断是否为空
//        boolean result = m.isEmpty();
//        System.out.println(result);
        //判断长度
        int size = m.size();
        System.out.println(size);

      //3.打印
        System.out.println(m);
    }
}
