package com.work;

import java.text.Format;
import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        float n= scan.nextFloat();
        if (n>0 && n<5){
            System.out.println(String.format("%.3f",(-1*n)+2.5));
        }
        else if (n>=5 && n<10){
            System.out.println(String.format("%.3f",2-1.5*(n*n-9)));
        }else if(n>=10 && n<20){
            System.out.println(String.format("%.3f",0.5*n-1.5));
        }
    }
}
