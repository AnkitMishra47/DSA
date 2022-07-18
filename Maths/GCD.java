package com.company.Maths;

public class GCD {
    public static void main(String[] args) {
        int a = 2 ;
        int b = 13;
        System.out.println(FindGCD(a,b));

    }
    static int FindGCD(int a , int b){
        if (b==0){
            return a;
        }
        return FindGCD (b , a%b);
    }
}
