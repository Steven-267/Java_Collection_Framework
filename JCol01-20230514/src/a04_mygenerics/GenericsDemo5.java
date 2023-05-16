package a04_mygenerics;

import java.util.ArrayList;

/**
 * @author Steven
 * @ClassName GenericsDemo5.java
 * @Description 泛型不具备继承性，但是数据具备继承性
 * @createTime 2023-05-16 17:55
 **/
public class GenericsDemo5 {
    public static void main(String[] args) {

        //1、创建集合对象
        ArrayList<Ye> list1 = new ArrayList<>();
        ArrayList<Fu> list2 = new ArrayList<>();
        ArrayList<Zi> list3 = new ArrayList<>();
        //2、体现泛型不具备继承性
//        method(list1);
//        method(list2);
//        method(list3);
        //体现数据具备继承性
        list1.add(new Ye());
        list1.add(new Fu());
        list1.add(new Zi());
        System.out.println(list1);

    }
    //此时，泛型里面写的是什么类型，那么只能传递什么类型的数据

//    public static void method(ArrayList<Ye> list){
//
//    }


}
class Ye{
}
class Fu extends Ye {
}
class Zi extends Ye {
}