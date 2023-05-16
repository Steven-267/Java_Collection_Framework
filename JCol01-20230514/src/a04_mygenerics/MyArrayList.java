package a04_mygenerics;

import java.util.Arrays;

/**
 * @author Steven
 * @ClassName MyArrayList.java
 * @Description
 *  当我在编写一个类的时候，如果不确定类型，那么这个类就可以定义为泛型类。
 * @createTime 2023-05-16 12:43
 **/
public class MyArrayList<E> {
    Object[] obj = new Object[10];
    int size;

    /**
     * E：表示不确定的类型，该类型在类名后面已经定义过了
     * e：形参的名字，变量名
     */
    public boolean add(E e){
        obj[size] = e;
        size++;
        return true;
    }

    public E get(int index){
        return (E)obj[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(obj);
    }
}
