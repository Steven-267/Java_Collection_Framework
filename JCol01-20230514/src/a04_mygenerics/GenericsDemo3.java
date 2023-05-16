package a04_mygenerics;

import java.util.ArrayList;

/**
 * @author Steven
 * @ClassName GenericsDemo3.java
 * @Description 定义一个ListUtil
 *  类中定义一个静态方法addall，用来添加多个集合的元素
 * @createTime 2023-05-16 17:14
 **/
public class GenericsDemo3 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ListUtil.addAll(list1,"aaa","bbb","ccc");
        System.out.println(list1);


    }
}
