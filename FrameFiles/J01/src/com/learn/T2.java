package com.learn;

import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a= scan.nextInt();
        int b= scan.nextInt();
        int flag;
        for (int i=a;i<=b;i++){
            flag=0;
            for (int j=2;j<=b;j++){
                if(i%j==0){
                    flag++;
                }
            }
            if (flag==1){
                System.out.println(i);
            }
        }
    }
}
