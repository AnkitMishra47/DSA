package com.company.Arrays;

public class MinStepstosort {
    public static void main(String[] args) {
        int[] arr = { 402,88,250 ,320, 378, 432, 116, 502, 625, 133, 903, 570, 74, 67, 679, 763 ,851, 289, 918 ,808 ,905 ,279, 320, 426, 868};
        int ans = Minswap(arr);
        System.out.println(ans);
    }
    static int Minswap(int[] arr){
        int max ;
        int count = 0 ;
        for (int i = 0; i <arr.length ; i++) {
            max = getmax(arr,0,arr.length-i);
            if (max != arr.length -1-i){
                swap(arr,max , arr.length-1-i);
                count++;
            }
        }
        return count;
    }
    static int getmax(int[] arr , int lo , int hi){
        int max = 0 ;
        for (int i = lo; i <hi ; i++) {
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] arr , int f , int s ){
        int temp =arr[s];
        arr[s] = arr[f];
        arr[f] =temp;
    }
}
