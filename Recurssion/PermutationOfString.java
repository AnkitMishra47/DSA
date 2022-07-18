package com.company.Recurssion;

import java.util.ArrayList;
import java.util.Arrays;

public class PermutationOfString {
    public static void main(String[] args) {
        String str = "abc";
        //System.out.println( isPalin(str,0,str.length()-1));
         // System.out.println(SubsequenceStr("" , str,new ArrayList<>()));
//        Permute(str, 0 ,str.length()-1);
     subSet("" , str);
    }
    //1. Palindrome String
    static boolean isPalin(String str,int lo , int hi){
        if (lo>= hi){
            return true;
        }
        if (str.charAt(lo)==str.charAt(hi)) {
            return isPalin(str, lo + 1, hi - 1);
        }
        else
            return false;
    }
    // 2. Subset of a string
    static void subSet(String p , String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subSet(p+ch,up.substring(1));
        subSet(p,up.substring(1));
    }
    //3. Permutation of String
    static void Permute(String str , int lo , int hi  ){
        if (lo==hi){
            System.out.println(str);
            return ;

        }
        for (int i = lo; i <=hi ; i++) {
            str = swap(str,lo,i);
            Permute(str , lo+1, hi );
            str = swap(str,lo,i);
        }
    }
    static String swap(String str ,int i , int j){
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(i, str.charAt(j));
        sb.setCharAt(j, str.charAt(i));
        return sb.toString();
    }
}

