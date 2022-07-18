package com.company.Recurssion;

public class numwaysmcrossn {
    public static void main(String[] args) {
        System.out.println(findways(3, 3));
    }
    static int findways(int n , int m){
        if (n==1 || m==1){
            return 1;
        }

        return findways(n-1 , m) + findways(n , m-1);

    }
}
