package com.company.StringsPrac;

import java.util.*;

public class subset {
    public static void main(String[] args) {
       int[] arr = {1,2,3} ;
       ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        for (int i = 0; i <Math.pow(2,arr.length) ; i++) {
            ArrayList<Integer> inner = new ArrayList<>();
            int count = 0 ;
            int temp = i ;
            while (temp != 0){
                if ((temp&1) == 1){
                    inner.add(arr[count]);
                }
                count++;
                temp = temp >> 1 ;
            }
            outer.add(inner);
        }

        System.out.println(outer);
    }
}
