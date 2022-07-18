package com.company.BitManipulation;

public class clearithBit {
    public static void main(String[] args) {
        int n = 9 ;
        int i = 3;
        int mask = 1<<i;
        mask = ~(mask);
        n = n&mask;
        System.out.println(n);
    }
}
