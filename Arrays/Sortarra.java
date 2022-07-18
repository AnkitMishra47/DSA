package com.company.Arrays;

import java.util.Arrays;

public class Sortarra {
    public static void main(String[] args) {
        int[] arr = {2,5,4,3,1,6};
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 1; j < arr.length-i ; j++) {
                if (arr[j-1] > arr[j]){
                    int t  = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = t;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
