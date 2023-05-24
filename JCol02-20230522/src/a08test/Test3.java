package a08test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * @author Steven
 * @ClassName Test3.java
 * @Description\
 * 班级里有N个学生要求:
 * 被点到的学生不会再被点到。
 * 但是如果班级中所有的学生都点完了，需要重新开启第二轮点名。
 * @createTime 2023-05-24 13:36
 **/
public class Test3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list,"范闲","范建" ,"范统" ,"杜子腾", "杜琦燕","宋合泛","侯笼藤","朱益群", "朱穆朗玛峰","袁明媛");
        while(true) {
            Random r = new Random();
            int i = r.nextInt(list.size());
            String name = list.get(i);
            list.remove(name);
            if (list.size() == 0){
                Collections.addAll(list,"范闲","范建" ,"范统" ,"杜子腾", "杜琦燕","宋合泛","侯笼藤","朱益群", "朱穆朗玛峰","袁明媛");
            }
            System.out.println(name);
        }
    }
}
