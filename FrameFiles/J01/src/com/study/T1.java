package com.study;

/**
 * 封装
 * */
import java.util.Scanner;

class Stu{
    private String stuname;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public int getAge() {
        return age;
    }

    public String getStuname() {
        return stuname;
    }
}
public class T1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Stu stu=new Stu();
        System.out.println("请输入你的年龄");
        stu.setAge(scan.nextInt());
        System.out.println("请输入你的名称");
        stu.setStuname(scan.next());
        System.out.println("你的名称是"+stu.getStuname()+"\n"+"你的年龄是"+stu.getAge());
    }
}