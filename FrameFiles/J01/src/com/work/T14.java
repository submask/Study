package com.work;

public class T14 {
    public static void main(String[] args) {
        for (int n=6;n<=100;n+=2){//范围：6~100
            for (int a=3;a<n;a++){//a=3主要是由于6的最小质数是2的话，那么另外一个就不是质数
                if (isShusu(a)&&isShusu(n-a)){
                    System.out.println(n+"="+a+"+"+(n-a));
                    break;
                }
            }
        }
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
