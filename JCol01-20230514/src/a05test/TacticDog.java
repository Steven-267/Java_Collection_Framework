package a05test;

/**
 * @author Steven
 * @ClassName TaidiDog.java
 * @Description
 * @createTime 2023-05-17 14:57
 **/
public class TacticDog extends Dog{
    public TacticDog(String name, int age) {
        super(name, age);
    }
    @Override
    public void eat() {
        System.out.println("一只叫做"+getName()+getAge()+"岁的泰迪边吃骨头边卖萌");

    }
}
