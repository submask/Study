package com.work.SanJiaoXingCircle.T24;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        B b=new B(scan.nextInt(),scan.nextInt(),scan.nextInt());
        System.out.println(b.Circle());
    }
}
