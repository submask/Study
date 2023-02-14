package com.learn;

import java.util.Scanner;

public class T4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        visitor vis=new visitor();
        vis.setName(scan.next());
        int age=scan.nextInt();
        vis.setAge(age);
        String paper="";
        if(vis.getAge()==0){
            paper="免费";
        }else{
            paper=vis.getAge()+"元";
        }
        System.out.println(vis.getName()+"的年龄是"+age+"门票"+paper);
    }
    public static class visitor{
        private String name;
        private int age;

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            if(this.age>60||this.age<18){
                return 0;
            }
            return 20;
        }
    }
}
