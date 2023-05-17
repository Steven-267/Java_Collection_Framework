package a05test;

import java.util.ArrayList;

/**
 * @author Steven
 * @ClassName Test1.java
 * @Description
 * @createTime 2023-05-17 14:20
 **/
public class Test1 {
    public static void main(String[] args) {
    ArrayList<LihuaCat> list1 = new ArrayList<>();
    ArrayList<HuskyDog> list2 = new ArrayList<>();
    ArrayList<Dog> list3 = new ArrayList<>();
    list3.add(new HuskyDog("jiji",2));
    list3.add(new TacticDog("kaka",2));
    list1.add(new LihuaCat("mimi",3));
    //KeePet(list1);
    //KeePet(list2);
        //KeePet(list3);
    }

//    //要求一：该方法能养所有品种的猫 但是不能养狗
//    public static void KeePet(ArrayList<? extends Cat> list){
//        for(Cat c:list){
//            c.eat();
//        }
//    }

//    //要求二：该方法能养所以品种的狗，但是不能养猫
//    public static void KeePet(ArrayList<? extends Dog> list){
//        for (Dog dog : list) {
//            dog.eat();
//        }
//    }
    public static void KeePet(ArrayList<Animal> list){
        for (Animal ani : list) {
            ani.eat();
        }
    }
}
