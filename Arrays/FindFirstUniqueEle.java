package com.company.Arrays;

import java.util.HashMap;

public class FindFirstUniqueEle {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1};
        //So we have to find the first unique element in the list ;
       int num =  FindFirstUnique(arr);
        System.out.println(num);
    }
    static int FindFirstUnique(int[] arr){
        int ans = -1;
        HashMap<Integer , Integer> hm = new HashMap<>();
        for (int x : arr) {
            if (hm.containsKey(x)) {
                hm.put( x , hm.get(x) + 1);
                continue;
            }
            hm.put(x, 0);
        }
        // Now checking the first 0 in array;
        for (int x : arr) {
            if (hm.get(x) == 0) {
                return x;
            }
        }

        return ans;
    }
}
