package com.company.Maths;

public class ModuloArithmetics {
    public static void main(String[] args) {
        // System.out.println(ModuloOp(3,3 , 1000000007));
        System.out.println(fastPower(5,4));
    }
    // Fast Power
    static int fastPower(int a , int b){
        int res = 1;
        while (b>0){
            if ((b&1) != 0 ){
                res = res * a; // res = 3 , res = 3* 81 = 243
            }
            a = a*a;  // a =  9  , a = 81
            b = b >> 1; // b = 2  , b = 1
        }
        return res;
    }
    // for Higher range number
    static long ModuloOp(long a , long b , int n){
        long res = 1;
        while (b > 0){
            if ((b&1) != 0){
                res = (res%n * a%n ) % n;  // (res*a) % n = (res%n * a%n ) %n ;
                // res = res * a
            }
            a = a%n * a%n ; // a = a*a;
            b = b>>1;
        }
        return res;
    }
}
