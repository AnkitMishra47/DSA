package com.company.Recurssion;

public class AtoB {
    public static void main(String[] args) {
        System.out.println(fastPow(2,8));
    }
    static int fastPow(int a , int b){
        if (b == 0){
            return 1;
        }
        return  a * fastPow(a , b-1);
    }
}
