package com.company.RSL;

import java.util.Arrays;

public class valid_Anagram {
    public static void main(String[] args) {
      String str = "123" ;
      int ans = convert( str) ;
      System.out.println(ans);
    }
    static int convert(String str ){
        if (str.length() == 1){
            // 123
            return (int)str.charAt(0) - 48;
        }
        int sum = 0 ;
        int first = ((int)str.charAt(0)-48);
        int i =  (int)Math.pow(10 ,str.length()-1);
        sum  = first*i + convert(str.substring(1)); // 20 + 3
        return sum ;
    }
}
