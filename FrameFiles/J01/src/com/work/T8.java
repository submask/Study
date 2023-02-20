package com.work;

public class T8 {
    public static void main(String[] args) {
        int sum=0;
        for (int i=1000;i<9999;i++){
            int a=i/1000;//千
            int b=(i-(a*1000))/100;//百
            int c=(i-(a*1000))%100/10;//十
            int d=(i-(a*1000))%100%10;//个
            if(d-c-b-a>0){
                sum+=1;
            }else {
                continue;
            }
        }
        System.out.println(sum);
    }
}
