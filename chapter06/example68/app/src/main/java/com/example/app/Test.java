package com.example.app;

import com.example.base.Person;

/**
 * @author wangzhichao
 * @since 2020/12/5
 */
public class Test {
    public static void main(String[] args) {
        // 使用 base 模块下的 Person：
        Person person = new Person();
        person.setName("wangzhichao");
        person.setAge(18);
        System.out.println(person);
    }
}
