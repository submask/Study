package com.work;

import java.util.Scanner;

public class T15 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        System.out.println(LeiJia(n));
    }
    public static int LeiJia(int n){
        int sum=0;
        if (n==1){
            return 1;
        }
        return n+LeiJia(n-1);
    }
}
