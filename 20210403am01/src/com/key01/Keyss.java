package com.key01;

import java.util.Scanner;
/**
 * @version V1.0
 * @PROJECT: 20210403am01
 * @Package com.key01
 * @Description:
 * @author: 杜文华
 * @date: 2021/4/3 11:30
 */
public class Keyss {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入要加密几组数据：");
        int num = input.nextInt();
        for (int sum=0;sum<num;sum++){
            System.out.print("原数据:");
            String str = input.next();
            char[] arr = str.toCharArray();
            int[] a = new int[50];
            a[0] = 1;
            a[1] = 2;
            a[2] = 4;
            String b="";
            if (arr.length == 1) {
                arr[0] = (char) (arr[0] + 1);
                int number0=(int) (arr[0]);
                if(number0>=123){
                    arr[0]-=26;
                }
                String m = new String(arr);
                System.out.println("加密后数据：" + m);
            } else if (arr.length == 2) {
                arr[0] = (char) (arr[0] + 1);
                int number0=(int) (arr[0]);
                if(number0>=123){
                    arr[0]-=26;
                }
                arr[1] = (char) (arr[1] + 2);
                int number1=(int) (arr[1]);
                if(number1>=123){
                    arr[1]-=26;
                }
                String m = new String(arr);
                System.out.println("加密后数据：" + m);
            } else if (arr.length == 3) {
                arr[0] = (char) (arr[0] + 1);
                int number0 = (int) (arr[0]);
                if (number0 >= 123) {
                    arr[0] -= 26;
                }
                arr[1] = (char) (arr[1] + 2);
                int number1 = (int) (arr[1]);
                if (number1 >= 123) {
                    arr[1] -= 26;
                }
                arr[2] = (char) (arr[2] + 4);
                int number2 = (int) (arr[2]);
                if (number2 >= 123) {
                    arr[2] -= 26;
                }
                String m = new String(arr);
                System.out.println("加密后数据：" + m);
            } else {
                arr[0] = (char) (arr[0] + 1);
                arr[1] = (char) (arr[1] + 2);
                arr[2] = (char) (arr[2] + 4);
                for (int i = 3; i < arr.length; i++) {
                    a[i] = a[i - 1] + a[i - 2] + a[i - 3];
                    int number = (int) a[i];
                    int number2 = (int) arr[i];
                    while ((number2+number) >= 123) {
                        number-=26;
                    }
                    arr[i] = (char) (arr[i] + number);
                }
                b = new String(arr);
                System.out.println("加密后数据：" + b);
            }

        }
    }

}