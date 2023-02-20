package com.work;

import java.util.Scanner;

public class T5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int score= scan.nextInt();
        if (score>=90 && score <=100){
            System.out.println("优秀");
        }else if (score>=75){
            System.out.println("良好");
        }else if (score>=60){
            System.out.println("合格");
        }else if (score>=0){
            System.out.println("不合格");
        }else{
            System.out.println("输入错误");
        }
    }
}
