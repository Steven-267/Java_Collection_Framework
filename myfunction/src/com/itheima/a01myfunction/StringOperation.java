package com.itheima.a01myfunction;

/**
 * @author Steven
 * @ClassName StringOperation.java
 * @Description
 * @createTime 2023-05-29 22:11
 **/
public class StringOperation {
    public boolean stringJudge(String s) {
        return s.startsWith("张" ) && s.length() == 3;
    }
}
