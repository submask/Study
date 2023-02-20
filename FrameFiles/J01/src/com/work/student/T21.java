package com.work.student;

import java.util.Scanner;

public class T21 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Student stu=new Student(scan.next(),scan.nextInt(),scan.next(),scan.nextInt(),scan.next());
        System.out.println(stu.toString());
    }
}
