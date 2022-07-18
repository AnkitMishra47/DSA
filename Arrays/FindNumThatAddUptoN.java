package com.company.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FindNumThatAddUptoN {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        //Arrays.sort(arr);
       // FindPair(arr,4);
        HashFunc(arr,2);
    }
    // 1. Using Sorting
    static void FindPair(int[] arr , int n){
        int s = 0;
        int e = arr.length -1;
        while (s < e){
            if (arr[s] + arr[e] > n){
                e--;
            }
           else if (arr[s] + arr[e] < n){
                s++;
            }
            else {
                System.out.println(arr[s] + " " + arr[e]);
                s++;
                e--;
            }
        }
    }

    // 2. Using Hashing
    static void HashFunc(int[] arr , int target ){
        HashMap<Integer , Integer> Hm = new HashMap<>();
        for (int i = 0; i <arr.length ; i++) {
            int x = arr[i];
            if (Hm.containsKey(target - x)){

                System.out.print(Hm.get(target -x)+" " + i);
                return;
            }
            Hm.put(x , i);
        }
        System.out.println("No result found");
    }

}
