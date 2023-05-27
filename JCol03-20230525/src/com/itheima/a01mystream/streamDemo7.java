import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

/**
 * @author Steven
 * @ClassName streamDemo7.java
 * @Description
 * distinct     元素去重，依赖(hashcode和equals方法)
 * concat       合并a和lb两个流为一个流
 * @createTime 2023-05-25 15:31
 **/
public class streamDemo7 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();

        Collections.addAll(list1,"张无忌","张无忌","张无忌","周芷若","赵敏","张强","张三丰","张翠山","张良","王二麻子","谢广坤");

        ArrayList<String> list2 =new ArrayList<>();
        Collections.addAll(list2,"周芷若","赵敏");

        //list1.stream().distinct().forEach(s-> System.out.println(s));

        Stream.concat(list1.stream(),list2.stream()).forEach(s-> System.out.println(s));

    }
}
