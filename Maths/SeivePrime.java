package com.company.Maths;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SeivePrime {
    public static void main(String[] args) {
        int n = 132;
        int [] arr = new int[n];
        for (int i = 0; i<n ; i++) {
            arr[i] = i+1;
        }
       boolean[] barr = sieveAlgo(arr);
        for (int i = 0; i < arr.length ; i++) {
            if (!barr[i]){
                System.out.print(arr[i]+ " ");
            }
        }
    }
    static boolean[] sieveAlgo(int[] arr ){
        boolean[] barr = new boolean[arr.length];
        barr[0] = true;
        for (int i = 1; i * i < arr.length ; i++) {
            if ( arr[i]%(i+1) == 0){
                for (int j = 2*i+1; j < arr.length ; j = j + i + 1) {
                    barr[j] = true;
                }
            }
        }
        return barr;
    }
}
