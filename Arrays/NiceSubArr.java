package com.company.Arrays;

import java.util.Scanner;

public class NiceSubArr {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length  ; i++ ){
            arr[i] = sc.nextInt();
        }
        int count = 0 ;
        int ans= 0 ;
        for(int i = 0; i < arr.length ; i++){
            for(int j = i; j  < arr.length  ; j++ ){
                if(arr[j]%2==0){
                    count++;
                }
                if(count == k){
                    count = 0 ;
                    ans++;
                    break;
                }
            }

        }
        System.out.println(ans);
    }
}
