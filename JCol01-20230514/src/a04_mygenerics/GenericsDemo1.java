package a04_mygenerics;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Steven
 * @ClassName GenericsDemo1.java
 * @Description
 * @createTime 2023-05-16 16:16
 **/
public class GenericsDemo1 {
    public static void main(String[] args) {
        //1.创建集合对象
        ArrayList list = new ArrayList();

        //2.添加数据
        list.add(111);
        list.add("aaa");
        list.add(new Student("张三",123));


        //3.遍历集合
        Iterator it = list.iterator();
        while(it.hasNext()) {
            Student o = (Student)it.next();
            //多态的弊端是不能访问子类特有的功能
            //obj.length();
            //str.length();
            System.out.println(o);
        }

    }
}
