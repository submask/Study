package com.learn.T7;

public class A implements Shape{
    public double num1;
    public double num2;

    public A(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public double Area() {
        return num1*num2;
    }

    @Override
    public double Circle() {
        if(num1==num2){
            return num1*4;
        }
        return num1*num2;
    }
}
