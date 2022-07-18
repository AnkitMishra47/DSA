package com.company.Arrays;

import java.util.Arrays;

public class Sliding_Window {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        int[] newArr = getArr(arr,k);

        System.out.println(Arrays.toString(newArr));
    }
    // 1. Using Iteration
    private static int[] getArr(int[] arr, int k) {
        int[] newArr = new int[arr.length -k +1];
        for (int i = 0; i < newArr.length ; i++) {
            newArr[i] = getMax(arr,i,i+ k);
        }
        return newArr;
    }
    private static int getMax(int[] arr, int lo, int hi) {
        int max = Integer.MIN_VALUE;
        for (int i = lo; i < hi ; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    //2. Using AVL tree
}
