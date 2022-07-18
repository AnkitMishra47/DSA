package com.company.Recurssion;

import java.util.Arrays;

public class PrintPattern {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,0};
        printPattern(arr , arr.length -1 , 0 );
        System.out.println(Arrays.toString(arr));
    }
    static void printPattern( int[] arr , int row , int col){
        if (row ==  0 ) return;

        if (col < row){
            if (arr[col] > arr[col+1]){
                swap(arr , col ,col+1);
            }
            printPattern(arr , row , col + 1);
        }
        else {
            printPattern(arr , row-1, 0);
        }
    }
    static void swap(int[] arr, int f , int s){
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp ;
}
}
