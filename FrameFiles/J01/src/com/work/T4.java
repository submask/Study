package com.work;

import java.util.Scanner;

public class T4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num= scan.nextInt();
        String urgent= scan.next();
        int price = 8;
        switch (urgent) {
            case "y":
                price += 5;
                if (num >= 1000) {
                    price += (((num - 1000) / 500) * 4)+4;
                }
                break;
            case "n":
                if (num >= 1000) {
                    price = + (((num - 1000) / 500) * 4)+4;
                }
                break;
        }
        System.out.println(price);
    }
}
