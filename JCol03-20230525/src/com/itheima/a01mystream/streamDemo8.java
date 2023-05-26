import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

/**
 * @author Steven
 * @ClassName streamDemo8.java
 * @Description         map         转换流中的数据类型
 * @createTime 2023-05-25 15:31
 **/
public class streamDemo8 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌-15","周芷若-14","赵破-13","张强-20","张三丰-108","张举l山l-40","张良-5","王二麻子-37","谢广坤-67");

        //第一个类型:流中原本的数据类型
        //第二个类型:要转成之后的类型
        //apply的形参s:依次表示流里面的每一个数据
        // 返回值:表示转换之后的数据
      /*  list.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                String[] arr = s.split("-");
                String ageString= arr[1];
                int age = Integer.parseInt(ageString);
                return age;
            }
        }).forEach(s-> System.out.println(s));
*/
        list.stream().map(s->Integer.parseInt(s.split("-")[1])).forEach(s -> System.out.println(s));

    }

}
