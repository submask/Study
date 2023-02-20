package com.work;

import java.util.Scanner;

public class T17 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            int b=arr.length;
            arr[n-i-1]=scan.nextInt();
        }
        isAvg(arr);
    }
    public static void isAvg(int arr[]){
        int sum=0;
        int avg;
        for(int arrs=0;arrs<arr.length;arrs++){
            sum+=arr[arrs];
        }
        avg=sum/arr.length;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>avg){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
