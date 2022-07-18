package com.company.Recurssion;

public class josephusProb {
    public static void main(String[] args) {

        System.out.println(circleprob(5 ,  3 ));
    }
    static int circleprob(int n , int k ){
        if (n==1){
            return 0;
        }
        return (circleprob(n-1,k) + k )%n;
    }
}
