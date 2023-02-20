package com.work.clock;

import java.util.Scanner;

public class T22 {
    public static void main(String[] args) {
        Scanner time=new Scanner(System.in);
        Clock clock=new Clock(time.nextInt(),time.nextInt(),time.nextInt());
        System.out.println(clock.show());
    }
}
