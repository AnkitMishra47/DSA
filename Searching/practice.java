package com.company.Searching;

public class practice {
    static   public int solve(int[] arr, int target) {
        int peak = getpeak(arr) ;
        int first = binarySearch1(arr , target , 0 , peak);
        int second = binarySearch2(arr , target,peak ,arr.length-1);

        return first ==-1 ? second : first ;

    }
    static int getpeak(int[] arr){
        int s = 0 ;
        int e = arr.length-1 ;

        while( s <= e){
            int mid = s + (e-s)/2 ;

            if(mid >= arr.length-1){
                break ;
            }

            if(arr[mid] < arr[mid+1]){
                s = mid+1 ;
            }
            else{
                e = mid-1 ;
            }
        }
        return s ;
    }

    static int binarySearch1(int[] arr , int target , int s , int e){
        while(s < e){
            int mid = s+ (e-s)/2;
            if(arr[mid] == target) return mid;

            if(arr[mid] < target){
                s = mid + 1 ;
            }
            else{
                e =  mid - 1;
            }
        }

        return -1 ;
    }
    static int binarySearch2(int[] arr , int target , int s , int e){
        while(s < e){
            int mid = s+ (e-s)/2;
            if(arr[mid] == target) return mid;

            if(arr[mid] < target){
                e = mid - 1 ;
            }
            else{
                s =  mid + 1;
            }
        }

        return -1 ;
    }


    public static void main(String[] args) {
        int[] arr = {12,14,19,13};
        System.out.println(solve(arr,13));
    }
}
