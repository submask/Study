package com.work;

import java.util.Scanner;

public class T20 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int max=0;
        int start,end;
        start=scan.nextInt();
        int t=1;
        for (int i=1;i<n;i++){
            end= scan.nextInt();
            if (end!=start){
                if(t>max){
                    max=t;
                }
                start=end;
                t=1;
            }else{
                t++;
            }
        }
        System.out.println(max);
    }
}
