package com.study;

import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        int t;
        for (int input=0;input<n;input++){
            arr[input]=scan.nextInt();
        }
        for (int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }
//        for(int i=0;i<arr.length;i++){
//            for (int j=i;j<arr.length-i-1;j++){
//              if (arr[j]<arr[j+1]){
//                  t=arr[j];
//                  arr[j]=arr[j+1];
//                  arr[j+1]=t;
//              }
//            }
//        }
        for (int k=0;k<arr.length;k++){
            System.out.print(" "+arr[k]);
        }
    }
}
