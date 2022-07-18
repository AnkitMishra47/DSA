package com.company.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PermutaionArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        permute(arr , 0 ,arr.length-1);
    }
    static void permute(int[] arr , int lo, int hi){
        if (lo ==hi){
            System.out.println(Arrays.toString(arr));
            return;
        }
        for (int i = lo; i <=hi ; i++) {
            swap(arr,lo,i);
            permute(arr,lo+1,hi);
            swap(arr,lo,i);
        }
    }
    static void swap(int[] arr , int f , int s){
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }
}
