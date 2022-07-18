package com.company.BitManipulation;

public class Convertatob {
    public static void main(String[] args) {
        int n1 = 22 ;
        int n2 = 27 ;
        int newNum = n1^n2;
        int count = 0 ;

        while (newNum != 0 ){
            count++;
        newNum = newNum & newNum-1;
        }
        System.out.println(count);
    }
}
