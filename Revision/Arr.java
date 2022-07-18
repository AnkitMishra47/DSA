package com.company.Revision;

import java.util.Arrays;

public class Arr {
    public static void main(String[] args) {
//        Prob - 1 Find subArr with max sum
       /* int[] arr = {-5,4,6,-3,-4,-1};
        int[] idx = KadaneAlgo(arr);
        System.out.println(Arrays.toString(idx));*/
 //      Prob - 2 Sieve of Eratosthenes
      /*  int n = 132;
        boolean[] arr= getAns2(n);
        for (int i = 2; i <arr.length; i++) {
            if (arr[i]){
                System.out.print(i+" ");
            }
        }*/
// Prob -3 GCD
       /* int a = 6;
        int b = 12;
        System.out.println(GCD(a,b));*
        */
        //Prob -4 N*m Ways
        int n = 3;
        int m = 2;
        System.out.println(NumberOfWay(n , m));

    }
         static int GCD(int a , int b){
        if (b==0){
            return a;
        }
        return GCD(b, a%b);
     }
     static int NumberOfWay(int n , int m){
        if (n==1 || m==1){
            return 1;
        }
        return NumberOfWay(n,m-1)+NumberOfWay(n-1,m);
     }
         static int[] KadaneAlgo(int[] arr ){
        int currSum = 0;
        int maxSum = 0;
        int s = -1;
        int e = -1;
        for (int i = 0; i <arr.length ; i++) {
            currSum+= arr[i];
            if (currSum > maxSum){
                maxSum = currSum;
                e = i;
            }
            if (currSum <0 ){
                currSum = 0 ;
                s= i+1;
            }
        }
        return new int[]{s,e};
    }
         static boolean[] getAns2(int n){
        boolean[] arr = new boolean[n+1];
        Arrays.fill(arr,true);
        for (int i = 2; i*i <=n ; i++) {
            for (int j =i+i ; j <= n;  j = j+i) {
                         arr[j]=false;
            }
        }
        return arr;
    }
}
