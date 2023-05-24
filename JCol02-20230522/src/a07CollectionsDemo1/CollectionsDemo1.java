package a07CollectionsDemo1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @author Steven
 * @ClassName CollectionDemo1.java
 * @Description
 *  * public static <T> boolean addAll(collection<T> c, T... elements)     批量添加元素
 *  * public static void shuffle(List<?> list)                             打乱List集合元素的顺序
 * @createTime 2023-05-24 11:37
 **/
public class CollectionsDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list,"abc","abch","abcg","abcf","abce","abcd","ab","a","hazel");

        System.out.println(list);

        Collections.shuffle(list);

        System.out.println(list);
    }
}
