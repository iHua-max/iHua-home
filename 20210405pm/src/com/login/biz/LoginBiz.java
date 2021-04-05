package com.login.biz;

import com.login.dao.LoginDao;
import com.login.dao.StudentDao;
import com.login.entity.Student;
import com.login.entity.User;

/**
 * @version V1.0
 * @PROJECT: 20210405pm
 * @Package com.login.biz
 * @Description: 业务逻辑类
 * @author: 杜文华
 * @date: 2021/4/5 20:10
 */
public class LoginBiz {
    /*/**
     * @Author:杜文华
     * @Description:登录的业务逻辑
     * @Date: 2021/4/5
     * @param: [user]
     * @return: boolean
     */
    public Student doLogin(User user){
        //声明返回值
        Student stu;
        //构建对象
        LoginDao ldao = new LoginDao();
        //执行登录
        boolean login = ldao.login(user);
        if (login){
           //登录成功了
            StudentDao sdao = new StudentDao();
            stu = sdao.initStudentInfo();
        }else {
            stu = null;
        }
        return stu;
    }

}