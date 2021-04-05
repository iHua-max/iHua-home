package com.ables;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @version V1.0
 * @PROJECT: 20210403
 * @Package com.ables
 * @Description:
 * @author: 杜文华
 * @date: 2021/4/3 11:43
 */
public class Abless {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入总人数：");
        int person = input.nextInt();
        System.out.println("每个人的能力如下：");
        int arr[] = new int[person];
        int num=0;
        int count = 0;
        while( count < person ) {
           double a=((Math.random())/2)*1000000;
            num=(int)a;
            arr[count] = num;
            count++;
        }
        for( int i = 0; i < arr.length; i++ ) {
            System.out.print( arr[i] + "  " );
        }
        Arrays.sort(arr);
        System.out.println("\n");
        System.out.print("请输入要求的团队最低值：");

        int lower=input.nextInt();
        int sum1=0;
        int r=0;
        int k=0;
        for( int i = 0; i < arr.length; i++ ){
            int[] m=new int[arr.length];

            if (arr[r]>lower){
                m[k]=arr[r];
                sum1++;
            }
            k++;
            r++;

        }
        int []u=new int[person];
        int v=0;
        int x=0;
        for (int q=0;q<arr.length;q++) {
            if (arr[v] < lower) {
                u[x] = arr[v];
            }
            v++;
            x++;
        }
        int sum2=0;
        int j=0;
        for (int n=0;n<u.length;n++){
            for (int m=0;m<u.length-1-n;m++){
                int i = u[n] + u[m + 1 + n];
                if (i >=lower){
                    arr[j] =i;
                    j=j+1;
                    u[n]=0;
                    u[m+1+n]=0;
                    sum2+=1;
                }

            }
        }
        int sum=sum1+sum2;
        System.out.println("按每队最多两人的规则，最多可以派出"+sum+"支符合要求的团队");
    }
}
