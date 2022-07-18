package com.company.Searching;

import java.util.Arrays;

public class AggressiveCows {
    public static void main(String[] args) {
        int[] arr = {1,2,4,7};


    }
    public int maxDistance(int[] arr, int m) {
        Arrays.sort(arr);
        int s = 0 ;
        int max =0 ;
        int min = 0 ;
        for (int j : arr) {
            max = Math.max(max, j);
            min = Math.min(min, j);
        }
        int e = max;
        int ans = -1;
        while (s<=e){
            int mid = s+(e-s)/2;
            if (isPossible(arr,arr.length,m,mid)){
                ans = mid;
                e=mid-1;
            }
            else {
                s=mid+1;
            }
        }
        return ans;
    }
    static boolean isPossible(int[] arr , int n , int m , int mid){

        int ballCount =1;
        int lastpos = arr[0];
        for (int i = 0; i < n ; i++) {
            if(lastpos - arr[i] >=mid){
                ballCount++;
                if(ballCount==m){
                    return true;
                }
                lastpos = arr[i];
            }
        }
        return false;
    }
}
