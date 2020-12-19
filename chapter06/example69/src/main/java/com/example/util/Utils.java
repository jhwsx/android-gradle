package com.example.util;

/**
 * @author wangzhichao
 * @since 2020/12/19
 */
public class Utils {
    private Utils() {
        //no instance
    }

    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }
}
