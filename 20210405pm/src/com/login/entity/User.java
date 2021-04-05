package com.login.entity;

/**
 * @version V1.0
 * @PROJECT: 20210405pm
 * @Package com.login.entity
 * @Description: 用户类
 * entity包的作用是实体类，后面跟数据库的表一一对应
 * @author: 杜文华
 * @date: 2021/4/5 19:44
 */
public class User extends Person{
    private String userName;
    private  String password;

    public User(String name, int age) {
        super(name, age);
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public User(String name, int age, String userName, String password) {
        super(name, age);
        this.userName = userName;
        this.password = password;
    }
}