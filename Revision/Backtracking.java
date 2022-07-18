package com.company.Revision;

import java.util.Arrays;

public class Backtracking
{
    public static void main(String[] args) {
        String str = "ABC";
        Perm(str,0,str.length()-1);
    }
    static void Perm(String str , int lo , int hi){
        if (lo==hi){
            System.out.print(str+" ");
            return;
        }
        for (int i = lo; i <=hi ; i++) {
            str = swap(str , lo , i);
            Perm(str,lo+1,hi);
            str = swap(str , lo, i);
       }
    }
    static String swap(String str , int f , int s){
        char[] arr = str.toCharArray();
        char t = arr[f];
        arr[f] = arr[s];
        arr[s] = t;
      return String.valueOf(arr);
    }
}
