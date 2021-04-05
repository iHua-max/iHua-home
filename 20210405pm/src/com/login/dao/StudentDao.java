package com.login.dao;

import com.login.entity.Student;

/**
 * @version V1.0
 * @PROJECT: 20210405pm
 * @Package com.login.dao
 * @Description: 该方法初始化学生信息
 * @author: 杜文华
 * @date: 2021/4/5 20:02
 */
public class StudentDao {
    /*/**
     * @Author:杜文华
     * @Description:初始化学生信息
     * @Date: 2021/4/5
     * @param: []
     * @return: com.login.entity.Student
     */
    public Student initStudentInfo(){
        //构建返回值类型
        Student stu = new Student();
        stu.setStuNo("9527");
        stu.setScore(100);
        stu.setAge(25);
        stu.setName("华安");
        //返回数据
        return stu;
    }
}