package com.company.RSL;

public class equilibrium {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5};
        int idx = getEquilibrium(arr);
        System.out.println(idx);
    }
    static int getEquilibrium(int[] arr ){
        int left_sum = 0 ;
        int right_sum = 0 ;
        for (int i = 1; i <arr.length ; i++) {
            left_sum += arr[i-1];

            // calculating for right side
            for (int j = i+1; j <arr.length ; j++) {
                right_sum += arr[j];
            }
            // checking the sum
            if (left_sum == right_sum) return i ;
            right_sum = 0 ;
        }
        return -1 ;
    }
}
