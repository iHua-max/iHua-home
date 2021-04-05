package com.guess.game;

import java.util.Scanner;

/**
 * @version V1.0
 * @PROJECT: 20210405
 * @Package com.guess.game
 * @Description:
 * @author: 杜文华
 * @date: 2021/4/5 12:35
 */
public class Game3 {
    Scanner input = new Scanner(System.in);
    //属性
    //甲方
    Person person;
    //乙方
    Computer computer;
    //对战次数
    int count;
    public void initial(){
        person = new Person();
        computer = new Computer();
        count = 0;
    }
    //编写菜单的方法
    public void startGame(){
        //调用初始化方法
        initial();
        System.out.println("**************欢迎进入游戏世界************\n");
        System.out.println("\t\t********************");
        System.out.println("\t\t***** 猜拳，开始 *****");
        System.out.println("\t\t********************\n");
        System.out.println("出拳规则：1.剪刀 2.石头 3.布子");
        System.out.print("请选择对战角色：（1.刘备 2.孙权 3.曹操）：");
        int role = input.nextInt();
        if (role==1){
            computer.name="刘备";
        }else if (role==2){
            computer.name="孙权";
        }else if (role==3){
            computer.name="曹操";
        }
        System.out.println("您选择了和"+computer.name+"对战");
        System.out.print("要开始吗？（y/n）：");
        String con = input.next();//接收开始
        //用户出拳
        int perFist;
        //电脑出拳
        int compFist;
        while ("y".equals(con)){
            //出拳
            perFist=person.showFist();
            compFist=computer.showFist();
            //裁决
            if (perFist==1 && compFist==1 ||
                    perFist==2 && compFist==2 ||
                    perFist==3 && compFist==3){
                System.out.println("平局！");
            }else if (perFist==1 && compFist==3 ||
                    perFist==2 && compFist==1 ||
                    perFist==3 && compFist==2 ){
                System.out.println("结果：人赢了！");
                person.score++;
            }else {
                System.out.println("结果：电脑赢了！");
                computer.score++;
            }
            //对战一局
            count++;
            System.out.println(person.score+" VS "+computer.score);
            System.out.print("是否进行下一局（y/n）：");
            con= input.next();
        }
    }
}