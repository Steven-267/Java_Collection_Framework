package a05test;

/**
 * @author Steven
 * @ClassName LihuaCat.java
 * @Description
 * @createTime 2023-05-17 14:25
 **/
public class LihuaCat extends Cat{
    public LihuaCat(String name, int age) {
        super(name, age);
    }
    @Override
    public void eat() {
        System.out.println("一只叫做"+getName()+"的"+getAge()+"岁的狸花猫正在吃鱼");
    }
}
