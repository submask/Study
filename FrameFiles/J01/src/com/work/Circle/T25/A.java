package com.work.Circle.T25;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        B b=new B(scan.nextDouble());
        System.out.println(String.format("%.2f",b.Circle()));
        System.out.println(String.format("%.2f",b.Area()));
    }
}
