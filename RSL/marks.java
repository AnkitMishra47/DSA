package com.company.RSL;

public class marks {
    public static void main(String[] args) {
        int[] arr = {39, 38, 38, 37, 36, 36, 34, 31, 28, 28} ;
        System.out.println(rankOf(arr,40));
    }
    static int rankOf(int[] arr , int m){
        int rank = 1;
        for (int i = 0; i <arr.length-1; i++) {
            if (arr[i] <= m ){
                return rank ;
            }
            else if (arr[i] == arr[i+1]){
                continue;
            }
            rank += 1 ;
        }
        return rank ;
    }
}
