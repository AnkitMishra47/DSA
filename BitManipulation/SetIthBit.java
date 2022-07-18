package com.company.BitManipulation;

public class SetIthBit {
    public static void main(String[] args) {
        int n = 18;
        int i = 4; // position
        int mask = 1<<i ; // left shift ;
        n = n|mask;
        System.out.println(n);

    }
}
