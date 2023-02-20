package com.work;

import java.util.Scanner;

public class T6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int h= scan.nextInt();
        double hight=h;
        double sum=0;
        for (int i=0;i<10;i++){
            if (i==0){
                sum+=hight;
                hight /=2;
                continue;
            }
            hight /=2;
            sum+=hight*2;

        }
        System.out.println(String.format("%.4f",sum));
        System.out.println(String.format("%.7f",hight));
    }
}
