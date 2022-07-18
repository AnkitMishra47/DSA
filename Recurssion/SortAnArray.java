package com.company.Recurssion;

import javax.sql.rowset.Joinable;
import java.util.ArrayList;
import java.util.Arrays;

public class SortAnArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 0};
        int[] fun = { 3, 2,5};
        arr = Rsort(arr);
        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(insert(fun,4)));/
    }

    static int[] Rsort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        return insert(Rsort(Arrays.copyOfRange(arr, 0, arr.length - 1)), arr[arr.length - 1]);

    }

    static int[] JoinArr(int[] arr, int k) {
        int[] mix = new int[arr.length + 1];
        int i = 0;
        for (; i < arr.length; i++) {
            if (arr[i] < k) {
                mix[i] = arr[i];
            } else {
                break;
            }
        }
        mix[i++] = k;
        while (i < mix.length) {
            mix[i] = arr[i - 1];
            i++;
        }
        return mix;
    }

    static int[] insert(int[] arr, int k) {
        if (arr.length == 0) {
            return new int[]{k};
        }
        if (arr[arr.length-1] <=k){
            int[] nArr = new int[arr.length+1];
            int i = 0 ;
            for (int e : arr) {
                nArr[i] = e;
                i++;
            }
            nArr[arr.length] = k;
            return nArr;
        }
        int[] prev = insert(Arrays.copyOfRange(arr, 0, arr.length - 1), k);
        int[] nArr = new int[prev.length+1];
        int i = 0 ;
        for (int e : prev) {
            nArr[i] = e;
            i++;
        }
        nArr[prev.length] = arr[arr.length-1];
        return nArr;
    }
}