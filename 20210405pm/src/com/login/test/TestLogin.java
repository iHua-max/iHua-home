package com.login.test;

import com.login.web.LoginAction;

import java.util.Scanner;

/**
 * @version V1.0
 * @PROJECT: 20210405pm
 * @Package com.login.test
 * @Description: 测试登录功能
 * @author: 杜文华
 * @date: 2021/4/5 20:35
 */
public class TestLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入用户名：");
        String uname = input.next();
        System.out.print("请输入密码：");
        String pwd = input.next();
        //构建对象
        LoginAction action = new LoginAction();
        boolean test = action.myLogin(uname,pwd);
        if (test){
            System.out.println("success!");
        }else {
            System.out.println("error!");
        }
    }
}