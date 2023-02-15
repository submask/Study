package com.learn;

import java.util.Scanner;

public class T4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Visitor vis=new Visitor(scan.next(), scan.nextInt());
        vis.Print();
    }
    public static class Visitor{
        private String name;
        private int age;

        public Visitor(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public void Print(){
            if(age>60&& age<18){
                System.out.println(name+"的年龄是"+age+",门票免费");
            }else{
                System.out.println(name+"的年龄是"+age+",门票20元");
            }
        }
    }
}
