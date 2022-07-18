package com.company.BitManipulation;

import java.util.Scanner;
import java.util.Stack;

public class compliment {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        String[] arr = new String[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.next();
        }
        String ans = str ;
        Stack<String> s = new Stack<>();
        for (int i = 0; i <arr.length ; i++) {
            char ops  = arr[i].charAt(0);
            s.push(ans);
            switch (ops){
                case '1' :
                    ans = append(ans,arr[i].substring(1));
                    break;
                case '2' :
                    ans = delete(ans , arr[i].charAt(1));
                    break;
                case '3' :
                    System.out.println( print(ans ,arr[i].charAt(1)));
                    break;
                case '4' :
                    s.pop();
                    ans = s.pop();
                    break;
            }
        }
    }
    static String append(String str , String nstr){
        return str + nstr;
    }
    static String delete(String ans , char num ){
        int n = Integer.parseInt(String.valueOf(num));
        return ans.substring(0,ans.length() - n);
    }
    static char print(String ans , char num ){
        int n = Integer.parseInt(String.valueOf(num));
        return ans.charAt(n-1);
    }
}
