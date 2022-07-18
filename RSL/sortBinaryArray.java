package com.company.RSL;

import java.util.Arrays;

public class sortBinaryArray {

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1};
        int zero_pointer = 0 ;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] ==  0 ){
                int temp = arr[i] ;
                arr[i] = arr[zero_pointer];
                arr[zero_pointer] = temp;

                zero_pointer++ ;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
