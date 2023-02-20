package com.work;

import java.util.Scanner;

public class T12 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int s= scan.nextInt();
        int max=0;
        int b;
        for (int a=0;a<s/2;a++){
            b=s-a;
            int sum=a*b;
            if (isShusu(a)&&isShusu(b)){
                if(max<sum){
                    max=sum;
                }
            }
        }
        System.out.println(max);
    }
    public static boolean isShusu(int n){
        for (int i=2;i<n;i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}
