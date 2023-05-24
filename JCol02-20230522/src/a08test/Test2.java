package a08test;

import javafx.util.converter.IntegerStringConverter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * @author Steven
 * @ClassName Test2.java
 * @Description
 * 自动点名器2
 * 班级里有N个学生要求:
 * 70%的概率随机到男生30%的概率随机到女生
 * @createTime 2023-05-24 13:36
 **/
public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Collections.addAll(list,1,1,1,1,1,1,1,0,0,0);

        Random r = new Random();

        Collections.shuffle(list);

        int i = r.nextInt(list.size());

        int number = list.get(i);

        ArrayList<String> boyList = new ArrayList<>();
        ArrayList<String> girlList = new ArrayList<>();

        Collections.addAll(boyList,"范闲","范建","范统","杜子腾","宋合泛","侯笼藤","朱益群","朱穆朗玛峰");
Collections.addAll(girlList,"杜琦燕","袁明媛","李猜","田蜜蜜");
        if (number == 1){
            int i1 = r.nextInt(boyList.size());
            System.out.println(boyList.get(i1));

        }else{

            int i2 = r.nextInt(girlList.size());
            System.out.println(girlList.get(i2));

        }
    }
}
