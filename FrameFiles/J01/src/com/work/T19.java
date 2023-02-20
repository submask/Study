package com.work;

import java.util.Scanner;

public class T19 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int arr[]=new int[n];
        int index=-1;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>232 &&arr[i]<1){
                continue;
            }else {
                arr[i]= scan.nextInt();
            }
        }
        for (int j=0;j<arr.length-1;j++){
            if(arr[j]<arr[j+1]){
                index=j+1;
            }
        }
        System.out.println(index);
    }
}
