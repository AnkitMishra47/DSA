package com.company.Maths;

public class PalindromeNo {
    public static void main(String[] args) {
        int n = 1091 ;
        int sum =0;
        int temp = n ;
        while (n  > 0 ){
            int r  = n%10;
            sum = sum*10+r;
            n /= 10;
        }
        if (sum == temp){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
