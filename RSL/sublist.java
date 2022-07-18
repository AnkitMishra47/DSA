package com.company.RSL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sublist {
    static List<ArrayList<Integer>> list = new ArrayList<>() ;
    public static void main(String[] args) {
     String str = "abcd" ;
      // getAllsubsquence(arr , 0 , arr.length - 1);
        // 123 132 321 231 312 213
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);
        ans.add(2);
        ans.add(3);

        getAllList(new int[]{1,2,3,4});
        System.out.println(list);
    }
static void getAllsubsquence(int[] arr , int lo , int hi ){
    if (lo ==  hi) {
        print(arr) ;
        return;
    }
    for (int i = lo; i <=hi ; i++) {
        swap(arr , lo , i);
        getAllsubsquence(arr , lo+1 , hi);
        swap(arr, lo , i ) ; // 1 2 3
    }
}
private static void print(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
static void swap(int[] arr , int f , int s){
        int temp  = arr[f] ;
        arr[f] = arr[s] ;
        arr[s] = temp ;
 }

 static void getAllList(int[] arr ) {
     for (int i = 0; i < Math.pow(2, arr.length) ; i++) {
       int num =  i  ;
       int j = 0 ;
       ArrayList<Integer> ans = new ArrayList<>() ;
         while (num != 0 ){
             if ((num&1) == 1) ans.add(arr[j]) ;
             num = num >> 1 ;
             j++ ;
         }
         list.add(ans) ;
     }
 }
}

