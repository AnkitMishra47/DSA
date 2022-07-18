package com.company.Arrays;

public class max_diff {
    public static void main(String[] args) {

        // 1 .  int [] arr = {2,3,10,12,5,1};
        //   variation of the ques

       int[][] mat = {{-1, 2, 3, 4},
                      {5, 3, -2, 1},
                      {6, 7, 2, -3},
                      {2, 9, 1, 4},
                      {2, 1, -2, 0}};

       int[] arr = new int[mat.length];
       int val_sum = 0 ;
        for (int i = 0; i <mat.length ; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                val_sum += mat[i][j] ;
            }
            arr[i] = val_sum;
            val_sum = 0 ;
        }
        System.out.println(maxDiff(arr));
    }
     //  TC - O(N) ; SC - O(1) ;
     static int maxDiff(int[] arr){
        int max_diff = arr[1] - arr[0];
        int min_ele = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            max_diff = Math.max(max_diff , arr[i] - min_ele);
            min_ele = Math.min(min_ele , arr[i]);
        }
        return max_diff;
    }
    // 2 loops


}
