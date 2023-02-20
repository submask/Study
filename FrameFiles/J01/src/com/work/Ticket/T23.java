package com.work.Ticket;

import java.util.Scanner;

public class T23 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Visitor vis=new Visitor(scan.next(),scan.nextInt());
        System.out.println(vis.PrintVisitor());
    }
}
