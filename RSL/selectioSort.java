package com.company.RSL;

import java.util.Arrays;

public class selectioSort {
    public static void main(String[] args) {
        int[] arr= {1,2,3,6,4};
        for (int i = 0; i < arr.length ; i++) {
           int max_idx = FindMax(arr, arr.length- i );
            int temp = arr[arr.length -1 - i ];
            arr[arr.length -1 - i ] = arr[max_idx] ;
            arr[max_idx] = temp ;
        }
        System.out.println(Arrays.toString(arr));
    }
    static int FindMax(int[] arr , int hi){
        int max = 0 ;
        for (int i = 0; i <hi ; i++) {
            if (arr[max] < arr[i]){
                max = i ;
            }
        }
        return max ;
    }
}
