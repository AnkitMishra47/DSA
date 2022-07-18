package com.company.Basic;

public class SquareRoot {
    public static void main(String[] args) {
        int x  = 12 ;
        System.out.println( calcSqr(x)  );

    }
    static  int calcSqr(int x) {
        if (x== 0 || x==1) return x ;
        int s = 0 , e = x , ans = 0 ;
        while(s<= e){
          int mid = s + (e-s)/2 ;
          if (mid*mid == x) return mid ;
          else if (mid*mid < x ){
              s = mid + 1 ;
              ans = mid ;
          }
          else {
              e = mid - 1 ;
          }

        }

     return ans ;
    }
}
