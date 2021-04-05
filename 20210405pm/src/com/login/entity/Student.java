package com.login.entity;

/**
 * @version V1.0
 * @PROJECT: 20210405pm
 * @Package com.login.entity
 * @Description: 学生类
 * @author: 杜文华
 * @date: 2021/4/5 19:37
 */
public class Student extends Person{
    private String stuNo;
    private double score;

    @Override
    public String toString() {
        return "Student{" +
                "stuNo='" + stuNo + '\'' +
                ", score=" + score +
                '}';
    }

    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Student(String name, int age) {
        super(name, age);
    }

    public Student() {
    }

    public Student(String name, int age, String stuNo, double score) {
        super(name, age);
        this.stuNo = stuNo;
        this.score = score;
    }

    public Student(String stuNo, double score) {
        this.stuNo = stuNo;
        this.score = score;
    }
}