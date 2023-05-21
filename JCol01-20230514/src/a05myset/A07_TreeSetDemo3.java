package a05myset;

import sun.reflect.generics.tree.Tree;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author Steven
 * @ClassName A07_TreeSetDemo3.java
 * @Description
 * 需求:请自行选择比较器排序和自然排序两种方式;
 * 要求:存入四个字符串，“c”，“ab”，“df”，“qwer”按照长度排序，如果一样长则按照首字母排序
 * @createTime 2023-05-21 16:14
 **/
public class A07_TreeSetDemo3 {
    public static void main(String[] args) {
   TreeSet<String> ts = new TreeSet<>((String o1, String o2)-> {
           int i = o1.length() - o2.length();
           i = i == 0 ? o1.compareTo(o2) : i;
           return i;
       }
   );

        ts.add("c");
        ts.add("ab");
        ts.add("df");
        ts.add("qwer");

        for (String t : ts) {
            System.out.println(t);
        }

    }
}
