package com.company.Arrays;

import java.util.Arrays;

public class SmallestPositiveNumber {
    static private int ele = 0 ;
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5};
        int ans  = findMissing(arr);
        System.out.println(ans);
    }
    static int findMissing(int[] arr){
            Arrays.sort(arr);
            int max  = 0 ;
            for (int i = 0; i <arr.length-1 ; i++) {
                int currSum = arr[i+1] - arr[i];
                if (arr[i]+ 1 < arr[i+1] & max > currSum){
                        max = currSum ;
                }
            }
            if (max==0){
                return arr[arr.length-1] + 1;
            }
        else return max;
    }
}
