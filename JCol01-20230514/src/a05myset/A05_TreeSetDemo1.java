package a05myset;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.function.Consumer;

/**
 * @author Steven
 * @ClassName A05_TreeSetDemo1.java
 * @Description 需求:利用TreeSet存储整数并进行排序
 * @createTime 2023-05-21 14:46
 **/
public class A05_TreeSetDemo1 {
    public static void main(String[] args) {

        //1。创建集合对象
        TreeSet<Integer> ts = new TreeSet<>();

        //2.添加元素
        ts.add(4);
        ts.add(2);
        ts.add(1);
        ts.add(3);
        ts.add(5);

        //3.打印集合
        //System.out.println(ts);

        //4.遍历
        //迭代器
        Iterator<Integer> it = ts.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("----------------------------");

        //增强for
        for (Integer t : ts) {
            System.out.println(t);
        }

        //lambda
        ts.forEach(i-> System.out.println(i));

    }

}
