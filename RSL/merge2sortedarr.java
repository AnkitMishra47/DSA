package com.company.RSL;

import java.util.Arrays;

public class merge2sortedarr {
    public static void main(String[] args) {
        int arr1[] = {1, 5, 9, 10, 15, 20};
        int arr2[] = {2, 3, 8, 23};

        merge(arr1 , arr2) ;
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
    static void merge(int[] arr1 , int[] arr2){
        int n = arr1.length ;
        int m = arr2.length ;

        for (int i = m-1; i >=0  ; i--) {
            int last = arr1[n-1] ;
            for (int j = n-2; j >= 0 ; j--) {
                if (arr1[j] > arr2[i]) {
                    arr1[j+1] = arr1[j] ;
                }
                else if (last > arr2[i]){
                    arr1[j+1] = arr2[i];
                    arr2[i] = last ;
                }
            }
        }


    }
}
