package com.company.Arrays;

public class findMaxSumSubArray {
    public static void main(String[] args) {
        int[] arr = {5 ,-4 , 9 ,-12 };
       System.out.println(KadeneAlgo(arr) );
    }
    public static int findMaxSumSubArray(int[] arr) {
        if (arr.length < 1) {
            return 0;
        }

        int currMax = arr[0];
        int globalMax = arr[0];
        int lengtharray = arr.length;
        for (int i = 1; i < lengtharray; i++) {
            if (currMax < 0) {
                currMax = arr[i];
            } else {
                currMax += arr[i];
            }

            if (globalMax < currMax) {
                globalMax = currMax;
            }
        }
        return globalMax;
    }
    public static int KadeneAlgo(int[] arr){
        int maxSum =0;
        int currSum = 0;
        for (int i = 0; i <arr.length ; i++) {
            currSum = currSum + arr[i];
            if (currSum > maxSum){
                maxSum = currSum;
            }
            if (currSum < 0)
            {
                currSum = 0;
            }
        }

        return maxSum;
    }
}
