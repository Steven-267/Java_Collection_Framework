package a02mylist;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Steven
 * @ClassName A02.java
 * @Description ·
 * @createTime 2023-05-14 20:46
 **/
public class A02 {
    public static void main(String[] args) {
        //List系列中的两个删除方法
        //直接删除元素
        //直接通过索引进行删除

        //1.创建集合并添加元素
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        //2.删除元素
        /**
         * 在调用方法的时候，如果方法出现了重载现象
         * 优先调用，实参和形参类型一致的那个方法
         */

        //list.remove(1);

        //也可以通过手动装箱，把基本数据类型的1，编程Integer类型
        Integer i = Integer.valueOf(1);
        list.remove(i);
        System.out.println(list);


    }
}
