package com.guess.game;
import java.util.Scanner;

/**
 * @version V1.0
 * @PROJECT: 20210405
 * @Package com.guess.game
 * @Description:
 * @author: 杜文华
 * @date: 2021/4/5 12:08
 */
public class Computer {
    //姓名
    String name = "曹操";
    //分数
    int score = 0;
    //出拳方法
    public int showFist(){
        int show = (int)(Math.random()*10)%3+1;
        switch (show){
            case 1:
                System.out.println("电脑出拳：剪刀");
                break;
            case 2:
                System.out.println("电脑出拳：石头");
                break;
            case 3:
                System.out.println("电脑出拳：布子");
                break;
            default:
                System.out.println("错误！");
                break;
        }
        return show;
    }

}