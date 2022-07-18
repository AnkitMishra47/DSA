package com.company.Maths;

import java.util.Scanner;

public class TrailingZeros {
    public static void main(String[] args) {
//        Trail Zeros in a Factorial ;
//        like in 6! is 120 and contains 1 0;
//        But can't store it in int or long coz number will overflow
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res =0 ;
        for (int i = 5; i <= n  ; i = i*5) {
            res = res +n/i;
            // n/5 + n/25 / n /125 .........so on
        }
        System.out.println(res);
    }
}
