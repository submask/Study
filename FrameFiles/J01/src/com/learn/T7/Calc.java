package com.learn.T7;

public class Calc {
    public void Print(Shape pic){
        System.out.println("周长"+String.format("%.2f",pic.Circle())+"面积"+String.format("%.2f",pic.Area()));
    }
}
