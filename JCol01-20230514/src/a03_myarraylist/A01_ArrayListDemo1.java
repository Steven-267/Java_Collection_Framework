package a03_myarraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author Steven
 * @ClassName A01_ArrayListDemo1.java
 * @Description
 * @createTime 2023-05-15 20:52
 **/
public class A01_ArrayListDemo1 {
    public static void main(String[] args) {
        //1.创建集合并添加元素
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //2.创建迭代器
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
