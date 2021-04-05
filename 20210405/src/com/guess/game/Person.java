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
public class Person {
    //姓名
    String name = "汤姆";
    //分数
    int score = 0;
    //出拳方法
    public int showFist(){
        //创建对象
        Scanner input = new Scanner(System.in);
        System.out.println("\n请出拳：1.剪刀 2.石头 3.布子");
        //接收
        int show = input.nextInt();
        switch (show){
            case 1:
                System.out.println("你出拳：剪刀");
                break;
            case 2:
                System.out.println("你出拳：石头");
                break;
            case 3:
                System.out.println("你出拳：布子");
                break;
            default:
                System.out.println("输入错误！");
                break;
        }
        return show;
    }

}