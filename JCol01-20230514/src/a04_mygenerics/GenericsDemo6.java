package a04_mygenerics;

import java.util.ArrayList;

/**
 * @author Steven
 * @ClassName GenericsDemo6.java
 * @Description
 * @createTime 2023-05-16 19:52
 **/
public class GenericsDemo6 {
    /**
     * 需求：定义一个方法，形参是一个集合，但是集合中的数据类型不确定
     */

    public static void main(String[] args) {
        ArrayList<Ye> list1 = new ArrayList<>();
        ArrayList<Fu> list2 = new ArrayList<>();
        ArrayList<Zi> list3 = new ArrayList<>();
        ArrayList<Student2> list4 = new ArrayList<>();

        method(list1);
        method(list2);
        method(list3);
        method(list4);
    }

    /**
     * 此时泛型里面写的是什么类型，那么只能传递什么类型的数据
     * 弊端：
     *  利用泛型方法有一个小弊端，此时它可以接受任意的数据类型
     *  Ye Fu Zi Students
     *
     *  希望：本方法虽然不确定类型，但是以后希望只能传递Ye Fu Zi
     *
     *  此时我们可以使用泛型的通配符：
     *      ？也表示不确定的类型
     *      它可以进行类型的限定
     *      ？ extends E： 表示可以传递E或者E所有的子类类型
     *      ？ super E:表示可以传递E或者E所有的父类类型
     *
     *      应用场景：
     */
    public static<E> void method(ArrayList<E> list){

    }

}
class Ye{
}
class Fu extends Ye {
}
class Zi extends Ye {
}
class Student2{

}