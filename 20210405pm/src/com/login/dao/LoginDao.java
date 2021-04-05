package com.login.dao;

import com.login.entity.User;

/**
 * @version V1.0
 * @PROJECT: 20210405pm
 * @Package com.login.dao
 * @Description: 做登陆的
 * 现实中我们需要访问数据库进行用户信息的合法校验
 * 但是我们现在只能使用打桩数据进行模拟
 * @author: 杜文华
 * @date: 2021/4/5 19:55
 */
public class LoginDao {
    /*/**
     * @Author:杜文华
     * @Description:登陆方法
     * @Date: 2021/4/5
     * @param: [user]
     * @return: boolean
     */
    public boolean login(User user){
        //声明一个返回值标识
        boolean flag = false;
        //模拟
        if ("admin".equals(user.getUserName()) && "admin".equals(user.getPassword())){
            //合法用户
            flag=true;
        }
        return flag;
    }
}