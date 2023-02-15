package com.learn.T7;

public class B implements Shape{
    public double num1;
    public double num2;
    public double num3;
    public double h;

    public B(double num1, double num2, double num3, double h) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.h = h;
    }

    @Override
    public double Area() {
        if (num1+num2<=num3||num1+num3<=num2||num2+num3<=num1){
            System.out.println("请重新输入三边");
        }
        return num3*h/2;

    }

    @Override
    public double Circle() {
        return num1+num2+num3;
    }
}
