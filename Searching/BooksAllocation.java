package com.company.Searching;

public class BooksAllocation {
    public static void main(String[] args) {
        int[] arr = {12 ,34, 67, 90};
        System.out.println(minPages(arr,arr.length,2) );
    }
    static int minPages(int[] arr , int n , int m ){
        int s = 0 ;
        int sum =0 ;
        for (int i = 0; i <arr.length ; i++) {
            sum += arr[i];
        }
        int e = sum;
        int ans = -1;
        while (s<=e){
            int mid = s+(e-s)/2;
            if (isPossible(arr,n,m,mid)){
                ans = mid;
                e =mid-1;
            }
            else {
                s=mid+1;
            }
        }
        return ans;
    }
    static boolean isPossible(int[] arr , int n , int m , int mid){
        int pageSum =0;
        int studentCount =1;
        for (int i = 0; i < n ; i++) {
            if (arr[i] + pageSum <= mid){
                pageSum += arr[i];
            }
            else {
                studentCount++;
                if (studentCount>m || arr[i] > mid ){
                    return false;
                }
                pageSum = arr[i];
            }
        }
        return true;
    }
}
