package com.learn.T7;

public class C implements Shape{
    public double r;
    private static final double pi = 3.14;
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
