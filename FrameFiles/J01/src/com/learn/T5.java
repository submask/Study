package com.learn;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class T5 {
    public static void main(String[] args) {
        String arr[]={"科特迪瓦","阿根廷","澳大利亚","塞尔维亚","荷兰","尼日利亚","日本","美国","中国","新西兰","巴西","比利时","韩国","喀麦隆","洪都拉斯","意大利"};
        ArrayList<String> list=new ArrayList<String>();
        for (int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        String b="";
        Random ran=new Random();
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                b=list.get(ran.nextInt(list.size()));
                System.out.print("  "+b);
                list.remove(b);
            }
            System.out.println("\n");
        }
    }
}
