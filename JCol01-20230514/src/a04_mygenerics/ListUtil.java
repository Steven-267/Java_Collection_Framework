package a04_mygenerics;

import java.util.ArrayList;

/**
 * @author Steven
 * @ClassName ListUtil.java
 * @Description
 * @createTime 2023-05-16 17:16
 **/
public class ListUtil {
    private void ListUnit(){
    }

    //类中定义一个静态方法addall，用来添加多个集合的元素

    /**
     * 参数一：集合
     * 参数二：最后要添加的元素
     */
    public static<E> void addAll(ArrayList<E> list, E...e){
        for (E element : e) {
            list.add(element);
        }
    }
}
