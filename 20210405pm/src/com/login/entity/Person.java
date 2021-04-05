package com.login.entity;

/**
 * @version V1.0
 * @PROJECT: 20210405pm
 * @Package com.login.entity
 * @Description:
 * @author: 杜文华
 * @date: 2021/4/5 19:35
 */
public class Person {
    private String name;
    private int age;
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

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

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}