package com.wzc.groovy
/**
 *
 * @author wangzhichao
 * @since 2022/2/10
 */
// >groovyConsole
// 不使用权限修饰符，默认是public
class Student {
    // 可以省略分号
    private String username
    private String email
    // 不使用权限修饰符，默认生成 getter/setter 方法
    int age
    // 可以省略 getter/setter
    // 默认带有具名构造器
    String getUsername() {
        return username
    }

    void setUsername(String username) {
        this.username = username
    }

    String getEmail() {
        return email
    }
}
