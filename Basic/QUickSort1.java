package com.company.Basic;

import java.util.ArrayList;
import java.util.Arrays;

public class QUickSort1 {
    public static void main(String[] args) {
        int[] arr = {4,5,3,7,2};
        arr = QuickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static int[] QuickSort(int[] arr,int lo , int hi){
        if (lo>= hi)
            return arr;
        int[] left = new int[arr.length];
        int i = 1;
        int p=0 ;
        int j = 0 ;
        while (i < arr.length){
            if (arr[i] < arr[p] ){
                left[j++] = arr[i];
            }
            i++;
        }
        System.out.println();
       int[] nArr = new int[arr.length];
        for ( i = 0; i < j ; i++) {
            nArr[i] = left[i];
        }
        nArr[i++] = arr[p];
        for (int k = 0 ; k < arr.length ; k++) {
            if (arr[k] > arr[p] && i < arr.length){
                nArr[i++] = arr[k];
            }
        }
        return nArr;
    }
}
