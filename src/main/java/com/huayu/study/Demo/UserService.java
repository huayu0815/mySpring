package com.huayu.study.demo;

/**
 * Created by zhaohuayu on 16/12/25.
 */
public class UserService {

    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sayUserInfo() {
        System.out.printf("hello,my name is %s, I'm %d years old!", name, age);
    }
}
