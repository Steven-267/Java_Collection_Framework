package com.itheima.a01mystream;

/**
 * @author Steven
 * @ClassName streamDemo13.java
 * @Description
 * @createTime 2023-05-25 18:29
 **/

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * 男演员:“蔡坤坤,24”，"叶狗咸,23"，"刘不甜,22"，"吴签,24"，"谷嘉,30"，"肖梁梁,27"
 * 女演员:“赵小颖,35”，"杨颖,36"，"高元元,43"，"张天天,31"，"刘诗,35""，"杨小幂,33"
 */
public class streamDemo13 {
    public static void main(String[] args) {
        ArrayList<String> manList = new ArrayList<>();
        ArrayList<String> womanList = new ArrayList<>();

        Collections.addAll(manList,"蔡坤坤,24","叶狗咸,23","刘不甜,22","吴签,24","谷嘉,30","肖梁梁,27");
        Collections.addAll(womanList,"赵小颖,35","杨颖,36","高元元,43","张天天,31","刘诗,35","杨小幂,33");


        Stream<String> stream1 = manList.stream().filter(s -> s.split(",")[0].length() == 3).limit(2);

        Stream<String> stream2 = womanList.stream().filter(s -> s.split(",")[0].startsWith("杨")).skip(1);


/*         Stream.concat(stream1, stream2).map(new Function<String, Actor>() {

             @Override
             public Actor apply(String s) {

                 return new Actor(s.split(",")[0],Integer.parseInt(s.split(",")[1]));
             }
         }).forEach(s-> System.out.println(s));*/

        Stream.concat(stream1, stream2)
                .map(s->new Actor(s.split(",")[0],Integer.parseInt(s.split(",")[1])))
                .forEach(s-> System.out.println(s));

    }
}
