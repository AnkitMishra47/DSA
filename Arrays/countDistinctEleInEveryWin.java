package com.company.Arrays;

import javax.swing.*;
import java.util.HashMap;
import java.util.HashSet;

public class countDistinctEleInEveryWin {
    public static void main(String[] args) {
        int[] arr = { 1,2,2,1,3,1,1,3};
        FindEle(arr , 4);
    }
    static void FindEle(int[] arr , int k ){
        HashMap<Integer , Integer> Map = new HashMap<>();
        for (int i = 0; i <arr.length ; i++) {
            Map.put(arr[i] ,Map.getOrDefault(arr[i], 0 ) +1 );

            if (i >= k-1) {
                System.out.println(Map.size());
                    if (Map.get(arr[i-k+1])==1)
                    Map.remove(arr[i - k+1]);
                    else
                        Map.put(arr[i-k+1] , Map.get(arr[i-k+1])-1);

                }


        }
    }
}
