package com.company.RSL;

public class pattern {
    public static void main(String[] args) {
        printPattern(23056);
    }
    static void printPattern(int num ){
        int n = (int)Math.log10(num) +1 ;
        int[] arr = new int[n];
        int i = 0 ;

        while (num != 0 ){
            arr[i++] =  num%10 ;
            num /= 10  ;
        }
        for (int j = n-1; j >=0 ; j--) {
            int ele = (int)(arr[j]*Math.pow(10 , j ));
            System.out.print(ele+" ");
            if (j != 0)
            System.out.print("+ ");
        }
    }
}
