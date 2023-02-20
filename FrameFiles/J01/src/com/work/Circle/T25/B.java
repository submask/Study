package com.work.Circle.T25;

public class B {
    private static final double pi = 3.14;
    private double r;

    public B(double r) {
        this.r = r;
    }

    public double Circle(){
        return (2)*pi*r;
    }
    public double Area(){
        return pi*r*r;
    }
}
