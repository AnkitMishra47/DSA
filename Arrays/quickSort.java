package com.company.Arrays;

import java.util.Arrays;

public class quickSort {
    static void quickSort(int[] arr){
        int lo = 0 ;
        int hi = arr.length-1;
        quickSort(arr,lo,hi);
    }
    static void quickSort(int[] arr , int lo , int hi){
        if (lo >= hi){
            return;
        }
        int s = lo ;
        int e = hi;
        int p = arr[lo+1];
   while (s<=e){
       while (arr[s] < p){
           s++;
       }
       while (arr[e] > p){
           e--;
       }
       if (s<=e){
           int temp = arr[s];
           arr[s] = arr[e];
           arr[e] = temp;
           s++;
           e--;
       }
   }
            quickSort(arr,lo,e);
            quickSort(arr,s,hi);

    }
    public static void main(String[] args) {
        int[] arr = {2,1,3,4,57,7};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
