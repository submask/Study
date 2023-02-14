package com.learn;

import java.util.Scanner;
/**
 * 1、找出所有和等于s的数
 * 2、找出数是质数的数
 * 3、求积
 * */
public class T3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int s=scan.nextInt();
        int max=0;
        for (int a=2;a<=s/2;a++){
            int b=s-a;
            int sum=a*b;
            if((isShusu(a)&&isShusu(b))) {
                if(max<sum) {
                    max = sum;
                }
            }
        }
        System.out.println(max);
    }
    public static boolean isShusu(int num){
       for (int i=2;i<num;i++){
           if(num%i==0){
               return false;
           }
       }
       return true;
    }
}
