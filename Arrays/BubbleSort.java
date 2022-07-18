package com.company.Arrays;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,5,0,4,2,1};
        //bubbleSort(arr);
        //insertionSort(arr);
        //selectionSort(arr);
         // QuickSort(arr,0,arr.length-1);
        arr = MergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    //swap function
    static void swap(int[] arr , int f , int s){
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }

    //1. BubbleSort
    static void bubbleSort(int[] arr){
        boolean isSorted = true;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 1; j < arr.length-i ; j++) {
                if (arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    isSorted = false;
                }
            }
            if (isSorted){
                break;
            }
            isSorted = true;
        }
    }
    //2.Insertion Sort
    static void insertionSort(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i; j > 0  ; j--) {
                if (arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
                else {
                    break;
                }
            }
        }
    }
    // 3.Selection Sort
    static void selectionSort(int[] arr){
        int minIdx =0 ;
        for (int i = 0; i <arr.length ; i++) {
            minIdx = getMin(arr,i,arr.length-1);
            swap(arr,i,minIdx);
        }
    }
    static int getMin(int[] arr , int lo , int hi){
        int min = lo;
        for (int i = lo; i <=hi ; i++) {
            if (arr[i] < arr[min]){
                min = i;
            }
        }
        return min;
    }
    // 4.QuickSort
    static void QuickSort(int[] arr , int lo , int hi){
        if (lo>=hi){
            return;
        }
        int p = arr[lo+1];
        int s = lo;
        int e = hi;
        while (s<=e){
            while (arr[s] < p){
                s++;
            }
            while(arr[e] > p){
                e--;
            }
            if (e>=s){
                swap(arr,s,e);
                s++;
                e--;
            }
        }
        QuickSort(arr,lo,e);
        QuickSort(arr,s,hi);
    }
    //5.Merge Sort
    static int[]  MergeSort(int[] arr){
        if (arr.length ==1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = MergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = MergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return mergeArr(left , right);
    }
      static int[] mergeArr(int[] left , int[] right){
        int i =0;
        int j= 0;
        int k = 0 ;
        int[] mix = new int[left.length + right.length];
        while (i < left.length && j <  right.length){
            if (left[i]>right[j]){
                mix[k] = right[j];
                j++;
            }
            else {
                mix[k] = left[i];
                i++;
            }
           k++;
        }
        while (i<left.length){
            mix[k++] = left[i];
            i++;
        }
        while (j < right.length){
            mix[k++] = right[j];
            j++;
        }
        return mix;
}
}
