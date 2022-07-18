package com.company.Maths;

import static java.lang.Math.max;

public class closest_prime
{
    public static void main(String[] args) {
        int n = 11 ;
        System.out.println(closestPrime(n));
    }
   static int closestPrime(int n ){
        int[] arr = new int[n+1];
       for (int i = 0; i <arr.length ; i++) {
           arr[i] = i ;
       }
       for (int i = 2; i*i<arr.length ; i++) {
           if (arr[i] % i == 0){
               for (int j = 2 * i; j < arr.length; j = j + i) {
                   arr[j] = 0;
               }
           }
       }
       for (int i = arr.length-1; i >=2 ; i--) {
           if (arr[i]!=0 ) return i ;
       }
   return -1;
   }
}
