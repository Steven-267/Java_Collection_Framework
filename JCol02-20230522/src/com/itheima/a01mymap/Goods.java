package com.itheima.a01mymap;

/**
 * @author Steven
 * @ClassName Goos.java
 * @Description 商品类
 * @createTime 2023-05-23 21:59
 **/
public class Goods implements  Comparable<Goods> {
    private int id;
    private String name;

    public Goods() {
    }

    public Goods(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Goods{id = " + id + ", name = " + name + "}";
    }



    @Override
    public int compareTo(Goods o) {
        return this.getId()-o.getId();
    }
}
