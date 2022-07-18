package com.company.Arrays;

import java.util.HashMap;

public class FindGivenSumInSubArray {
    public static void main(String[] args) {
        int []  arr = {10,15,-5,15,-10,5};
        FindSubArray(arr , 5);
    }
    static void FindSubArray(int[] arr , int sum){
        int s = 0 ;
        int e = -1;
        int currSum =0 ;
        HashMap<Integer , Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length ; i++) {
            currSum += arr[i];
            if (currSum == sum){
                s = 0 ;
                e = i ;
                break;
            }
            if (hm.containsKey(currSum - sum)){
                s = hm.get(currSum - sum) + 1;
                e = i;
                break;
            }
            hm.put(currSum , i);
        }
        if (e==-1){
            System.out.println("Not Found ");
        }
        else {
            System.out.println(s+  " " + e);
        }
    }
}
