package com.company.RSL;

public class printPrime {
    public static void main(String[] args) {
       boolean ans = true ;
        for (int i = 2; i <=100 ; i++) {
            for (int j = 2; j*j<= i  ; j++) {
                if (i%j==0) ans = false ;
            }
            if(ans) System.out.print(i+" ");
            ans = true;
        }
    }
}
