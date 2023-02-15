package com.learn.T7;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Calc cal=new Calc();
        System.out.println("请输入两个数值");
        cal.Print(new A(scan.nextDouble(),scan.nextDouble()));
        System.out.println("请输入三角形三边及高");
        cal.Print(new B(scan.nextDouble(),scan.nextDouble(),scan.nextDouble(),scan.nextDouble()));
        System.out.println("请输入圆的半径");
        cal.Print(new C(scan.nextDouble()));

    }
}
