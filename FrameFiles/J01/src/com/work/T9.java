package com.work;

import java.util.Scanner;

public class T9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a= input.nextInt();
        int b= input.nextInt();
        for (int n=a;n<=b;n++){
            if (isShusu(n)){
                System.out.println(n);
            }else {
                continue;
            }
        }
    }
    public static   boolean isShusu(int n){
        for (int i=2;i<n;i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}
