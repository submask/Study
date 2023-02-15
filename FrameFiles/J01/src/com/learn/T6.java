package com.learn;

import java.util.Scanner;

public class T6 {
    private static final double pi = 3.14;
    public static abstract class Shape{
        public  abstract double Area();
        public abstract  double Circle();
    }
    public static  class A extends Shape{
        public double n;

        public A(double n) {
            this.n = n;
        }

        @Override
        public double Area() {
            return n*n;
        }

        @Override
        public double Circle() {
            return n*4;
        }
    }
    public static class B extends Shape{
        public double num1;
        public double num2;
        public B(double num1, double num2) {
            this.num1 = num1;
            this.num2 = num2;
        }
        @Override
        public double Area() {
            return num1*num2;
        }

        @Override
        public double Circle() {
            return (num1+num2)*2;
        }
    }
    public static class C extends Shape{
        public double r;

        public C(double r) {
            this.r = r;
        }

        @Override
        public double Area() {
            return pi*r*r;
        }

        @Override
        public double Circle() {
            return 2*pi*r;
        }
    }


    public static   void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入边长");
        A a=new A(scan.nextDouble());
        System.out.println("请输入长和宽");
        B b=new B(scan.nextDouble(), scan.nextDouble());
        System.out.println("请输入半径");
        C c=new C(scan.nextDouble());
        System.out.println("正方形的面积是"+a.Area()+"正方形的周长是"+a.Circle());
        System.out.println("长方形的面积是"+b.Area()+"长方形的周长是"+b.Circle());
        System.out.println("圆的面积是"+c.Area()+"正方形的周长是"+c.Circle());
    }
}
