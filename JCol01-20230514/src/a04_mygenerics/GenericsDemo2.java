package a04_mygenerics;

/**
 * @author Steven
 * @ClassName GenericsDemo1.java
 * @Description测试MyArrayList
 * @createTime 2023-05-16 12:51
 **/
public class GenericsDemo2 {
    public static void main(String[] args) {
    MyArrayList<String> list = new MyArrayList<>();
    list.add("aaa");
    list.add("bbb");
    list.add("ccc");
        System.out.println(list);


        MyArrayList<Integer> list2 = new MyArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        int i = list2.get(0);
        System.out.println(i);
    }

}
