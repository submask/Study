package com.work;

import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        float num1= scan.nextFloat();
        float num2= scan.nextFloat();
        String symbol= scan.next();
        switch (symbol){
            case "+":
                System.out.println(String.format("%.2f",num1+num2));
                break;
            case "-":
                System.out.println(String.format("%.2f",num1-num2));
                break;
            case "*":
                System.out.println(String.format("%.2f",num1*num2));
                break;
            case "/":
                if (num2==0){
                    System.out.println("Divided by zero!");
                    break;
                }
                System.out.println(String.format("%.2f",num1/num2));
                break;
            default:
                System.out.println("Invalid operator!");
        }
    }
}
