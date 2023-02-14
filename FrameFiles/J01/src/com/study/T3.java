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
        for(int i=0;i<arr.length;i++){
            for (int j=i;j<arr.length-i-1;j++){
              if (arr[j]<arr[j+1]){
                  t=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=t;
              }
            }
        }
        for (int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }
    }
}
