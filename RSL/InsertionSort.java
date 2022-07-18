package com.company.RSL;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {1 , 2, 3, 4,6, 5};
        bubble_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion_sort(int[] arr){
        for(int i = 1 ; i < arr.length-1 ; i++){
            for (int j = i; j >= 0  ; j--) {
                if (arr[j] > arr[j+1]){
                    swap(arr ,j , j+1);
                }
                else break;
            }
        }
    }
    static void bubble_sort(int[] arr){
        for(int i = 0 ; i < arr.length; i++){
            for (int j = 1; j < arr.length - i ; j++) {
                if (arr[j-1] > arr[j]){
                    swap(arr ,j-1 , j);
                }
            }
        }
    }
    static void swap(int[] arr , int f , int s){
        int temp = arr[f] ;
        arr[f] = arr[s] ;
        arr[s] = temp ;
    }
}
