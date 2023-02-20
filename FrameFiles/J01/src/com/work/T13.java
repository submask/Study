package com.work;

import java.util.Scanner;

public class T13 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double a= scan.nextDouble();
        double b=scan.nextDouble();
        double c=scan.nextDouble();
        double sum=isMax(a,b,c)/(isMax(a+b,b,c)*isMax(a,b,b+c));
        System.out.println(String.format("%.3f",sum));
    }
    public static double isMax(double a,double b,double c){
        if (a<b&& b<c){
            return c;
        }else if(a>b && a>c){
            return a;
        }else if (a<b && b>c){
            return b;
        }else if (a==b && b>c){
            return b;
        }else if (a==c && c>b){
            return c;
        }else if(b==c&& c>a){
            return c;
        }else {
            return a;
        }
    }
}
