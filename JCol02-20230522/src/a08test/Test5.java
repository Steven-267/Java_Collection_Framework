package a08test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringJoiner;

/**
 * @author Steven
 * @ClassName Test5.java
 * @Description
 *
 * @createTime 2023-05-24 13:36
 **/
/*需求
定义一个Map集合，键用表示省份名称province，值表示市city，但是市会有多个。添加完毕后，遍历结果格式如下:
江苏省=南京市，扬州市，苏州市，无锡市，常州市
湖北省=武汉市，孝感市，十堰市，宜昌市，鄂州市
河北省=石家庄市，唐山市，邢台市，保定市，张家口市*/
public class Test5 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();

        Collections.addAll(list1,"南京市","扬州市","苏州市","无锡市","常州市");
        Collections.addAll(list2,"武汉市","孝感市","十堰市","宜昌市","鄂州市");
        Collections.addAll(list3,"石家庄市","唐山市","邢台市","保定市","张家口市");

        map.put("江苏",list1);
        map.put("湖北",list2);
        map.put("河北",list3);

        //遍历打印
        map.forEach((province,city) -> {

            StringJoiner sj = new StringJoiner("，");
            city.forEach(s -> {
                sj.add(s);
            }
            );
            System.out.println(province+"="+sj);

        });


    }
}
