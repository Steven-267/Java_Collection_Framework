package a08test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * @author Steven
 * @ClassName Test1.java
 * @Description
 * 自动点名器1
 * 班级里有N个学生，实现随机点名器。
 * @createTime 2023-05-24 13:35
 **/
public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list,"范闲","范建" ,"范统" ,"杜子腾", "杜琦燕","宋合泛","侯笼藤","朱益群", "朱穆朗玛峰","袁明媛");

        /*
        实现随机有两种方式
        方式一：
        使用random对象创建一个随机数再通过随机的数当作索引去访问列表
         */
 /*       Random r = new Random();
        int i = r.nextInt(list.size());
        System.out.println(list.get(i));*/

        /*
        方式二：
        使用Collection中的shuffle打乱list的顺序然后随机输出一个索引的值
         */

        Collections.shuffle(list);
        System.out.println(list.get(0));
    }
}
