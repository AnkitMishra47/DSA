package com.company.Arrays;

import java.util.HashMap;
import java.util.HashSet;

public class CountDistinctPairwithdiffK {
    public static void main(String[] args) {
        int[] arr = {1 ,5 ,4 , 1 ,2};
        int k = 0;
        CountDiffk(arr,1);

    }
    static void CountDiffk(int[] arr , int k){
        int count = 0 ;
        HashMap<Integer , Integer> Map = new HashMap<>();
        HashSet<Integer> Set = new HashSet<>();
        for (int i = 0; i <arr.length ; i++) {
            if (Map.containsKey(arr[i] + k ) ){
                if (!Set.contains(arr[i] + k ) && !Set.contains(arr[i]))
                    count++;
               Set.add(arr[i] + k );
               Set.add(arr[i]);
            }
            if ( Map.containsKey(arr[i] - k ) ){
                if (!Set.contains(arr[i] - k ) && !Set.contains(arr[i]))
                    count++;
                Set.add(arr[i] - k );
                Set.add(arr[i]);
            }
            Map.put(arr[i] , i);
        }
        System.out.println(count);

    }
}
