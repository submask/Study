package com.work;

public class T11 {
    public static void main(String[] args) {
        for (int n=10;n<=99;n++) {
            int a = n / 10;
            int b = n % 10;
            if(isShusu(a*10+b)&& isShusu(b*10+a)){
                if (a*10+b==b*10+a){
                    continue;
                }else{
                    System.out.println(n);
                }

            }
        }
    }
    public static boolean isShusu(int n){
        for (int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
