package com.login.web;

import com.login.biz.LoginBiz;
import com.login.entity.Student;
import com.login.entity.User;
import com.login.utils.Utils;

/**
 * @version V1.0
 * @PROJECT: 20210405pm
 * @Package com.login.web
 * @Description: 网络传输层
 * @author: 杜文华
 * @date: 2021/4/5 20:27
 */
public class LoginAction {
    /*/**
     * @Author:杜文华
     * @Description:
     * @Date: 2021/4/5
     * @param: [uname, pwd]
     * @return: boolean
     */
    public boolean myLogin(String uname,String pwd){
        //标记
        boolean flag = false;
        //构建loginBiz的对象
        LoginBiz biz = new LoginBiz();
        //构建user
        User user = new User();
        user.setUserName(uname);
        user.setPassword(pwd);
        //返回学生对象
        Student student = biz.doLogin(user);
        if (student!=null){
            flag=true;//改变登陆标识
            //使用多态的方法
            Utils.print(student);
        }
        return flag;
    }
}