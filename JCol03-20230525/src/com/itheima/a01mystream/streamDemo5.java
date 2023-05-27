package com.itheima.a01mystream;

import java.util.stream.Stream;

/**
 * @author Steven
 * @ClassName streamDemo5.java
 * @Description  一堆零散数据        public static<T> Stream<T> of(T... values)     stream接口中的静态方法
 * @createTime 2023-05-25 15:21
 **/
public class streamDemo5 {
    public static void main(String[] args) {
        Stream.of(1,2,4,5,"wosji").forEach(s-> System.out.println(s));

        /// /Stream接口中静态方法of的细节:
        ////方法的形参是一个可变参数，可以传递一堆零散的数据，也可以传递数组
        ////但是数组必须是引用数据类型的，如果传递基本数据类型，是会把整个数组当做一个
        //元素，放到Stream当中。
    }
}
