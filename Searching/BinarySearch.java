package com.company.Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6,7,8,9,10,11,12,13,14,15};
        System.out.println(binarySearch(arr,16) );
    }
static int binarySearch(int[] arr,int  target)
{
    int lo = 0 ;
    int hi = 1;

   while (hi<arr.length-1 && arr[hi] < target){

          lo = hi;
         if (hi*2 < arr.length-1)
          hi = 2*hi;
          else{
              hi = arr.length-1;
         }
   }
    return binarysearch(arr,target,lo,hi);
}
static int binarysearch(int[] arr , int target , int lo , int hi){
        while(lo<=hi){
            int mid = (lo+hi)/2;
        if (arr[mid] > target){
            hi = mid - 1;
        }
        else if(target > arr[mid]){
            lo = mid + 1 ;
        }
        else {
            return mid;
        }
        }
        return -1;
}
}

