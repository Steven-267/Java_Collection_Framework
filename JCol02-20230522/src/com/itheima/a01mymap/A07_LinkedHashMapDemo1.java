package com.itheima.a01mymap;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/**
 * @author Steven
 * @ClassName A07_LinkedHashMapDemo1.java
 * @Description - 由键决定:有序、不重复、无索引。
 * - 这里的有序指的是保证存储和取出的元素顺序一致这里的有序指的是保证存储和取出的元素顺序一致 -
 *  **原理**︰底层数据结构是依然哈希表，只是每个键值对元素又额外的多了一个**双链表**的机制记录存储的顺序。
 * @createTime 2023-05-23 16:04
 **/
public class A07_LinkedHashMapDemo1 {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();

        lhm.put( "a",123);
        lhm.put( "a",111);
        lhm.put( "b",456);
        lhm.put("c",789) ;
     }
}
