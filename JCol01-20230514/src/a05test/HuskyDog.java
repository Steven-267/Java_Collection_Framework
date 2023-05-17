package a05test;

/**
 * @author Steven
 * @ClassName HuskyDog.java
 * @Description
 * @createTime 2023-05-17 14:57
 **/
public class HuskyDog extends Dog{
    public HuskyDog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("一只叫做"+getName()+getAge()+"岁的哈士奇正在吃骨头和拆家");
    }
}
