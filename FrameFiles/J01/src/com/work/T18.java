package com.work;

import java.util.Scanner;

public class T18 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int arr[]=new int[n];
        int temp[]=new int[n];
        for (int arrs=0;arrs<n;arrs++){
            arr[arrs]= scan.nextInt();
        }
        /**
         * 1、先把最前面一个保存到t中
         * 2、再依次往前移
         * 3、把保存的内容放到最后面
         * */
        for (int i=0;i<n-1;i++){
            temp[i]=arr[i];
            temp[n-i-1]=arr[n-i-1];
            arr[i]=arr[i+1];
            arr[n-1]=temp[i];
            if(i==n-2){
                arr[n-1]=temp[0];
                arr[n-2]=temp[n-1];
            }
        }
        for (int k=0;k<n;k++){
            System.out.print(" "+arr[k]);
        }
    }
}
