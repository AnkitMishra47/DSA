package com.company.Arrays;

import java.util.HashMap;

public class majorityEle {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,3,3};
        // System.out.println(  MajorityEle(arr)  );
        System.out.println(MajEle(arr));
    }
    static int MajorityEle(int[] arr){
        HashMap<Integer , Integer> hm = new HashMap<>();
        for (int i = 0; i <arr.length ; i++) {
            if (!hm.containsKey(arr[i])){
                hm.put(arr[i] , 1);
                continue;
            }
            hm.put(arr[i] , hm.get(arr[i])+1);
        }
        int max = 0 ;
        int ans = 0 ;
        for (int i = 0; i <arr.length ; i++) {
            if (hm.get(arr[i]) > max){
                max = hm.get(arr[i]);
                ans = arr[i];
            }
        }
        if (max > arr.length/2){
            return ans;
        }
        return -1;
    }
    // Moore's Voting Algo
    static int MajEle(int[] arr){
        int ansIdx = 0;
        int count = 0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] == arr[ansIdx]){
                count++;
            }
            else {
                count--;
            }
            if (count==0){
                ansIdx = i ;
                count = 1;

            }
        }
        count=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[ansIdx]==arr[i]){
                count++;
            }
            if (count>arr.length/2){
                return arr[ansIdx];
            }
        }
        return -1;
    }
}
