package com.company.Searching;

public class SearchInaRotated {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        System.out.println( rotatedSearch(arr,2) );

    }
    static int rotatedSearch(int[] arr , int target){
        int s = 0;
         int e = arr.length-1;
         while (s<=e){
             int m = (e+s)/2;
             if (arr[m] == target)return m;
             if (arr[m] > arr[s]){
                 if (arr[s] <= target && arr[m]>target){
                     e=m-1;
                 }
                 else s=m+1;
             }
             else {
                 if (arr[e]>=target&&arr[m]< target){
                     s=m+1;
                 }
                 else e= m-1;
             }
         }
         return -1;
    }
}
