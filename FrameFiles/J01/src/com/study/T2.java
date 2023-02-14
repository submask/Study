package com.study;

import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        System.out.println(doOdd(num));
    }
    public  static  int doOdd(int sum){
        int arr_single[]=new int[sum];
        int arr_double[]=new int[sum];
        int sums=0;
        for(int i=0;i<sum;i++){
            if (sum%2==0){
                arr_double[i]=sum;
            }else{
                arr_single[i]=sum;
            }
        }
        for (int j=0;j<arr_single.length;j++){
            for(int k=0;k< arr_double.length;k++){
                sums=arr_single[j]*2-arr_double[k]/3;
            }
        }
        return sums;
    }

}
