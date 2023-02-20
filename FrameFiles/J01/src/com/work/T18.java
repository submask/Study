package com.work;

import java.util.Scanner;

public class T18 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int arr[]=new int[n+2];
        int t;
        for (int arrs=1;arrs<=n;arrs++){
            arr[arrs]= scan.nextInt();
        }
        for(int i=1;i<n;i++){
            if(i==1){
                t=arr[arr.length];
                arr[arr.length]=arr[1];
                arr[0]=t;
            }
        }
    }
}
