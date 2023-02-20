package com.work;

import java.util.Scanner;

public class T10 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int s=0;
        for (int i=1;i<=n;i++){
            s+=JieCheng(i);
        }
        System.out.println(s);
    }
    public static int JieCheng(int n){
        int sum=0;
        if(n==1){
            return 1;
        }
        return n*JieCheng(n-1);
    }
}
