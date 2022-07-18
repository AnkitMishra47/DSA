package com.company.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BuySellStock {
    public static void main(String[] args) {
        int[] arr = {5,2,7,3,4};
      /*  int [] days = FindMaxProfit(arr);
        System.out.println(Arrays.toString(days));*/
        FindMaxProfitAllDays(arr);
    }
    // Single buy and sell
    static int[] FindMaxProfit(int[] arr ){
        int maxIndex = FindMax(arr);
        int maxProfit = 0;
        int[] days = new int[2];
        for (int i = 0; i <=maxIndex ; i++) {
            if (arr[maxIndex] - arr[i] > maxProfit){
                days[0] = i+1;
                days[1] = maxIndex+1;
                maxProfit = arr[maxIndex] - arr[i];
            }
        }
        return days;
    }
    private static int FindMax(int[] arr) {
        int max = 0;
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }

    // Multiple buy and sell
    static void FindMaxProfitAllDays(int[] arr){
        int maxProfit = 0;
        int BuyPrice = 0;

        for (int i = 0; i <arr.length -1; i++) {
         if (arr[i] < arr[i+1]){
             maxProfit += arr[i+1] - arr[i];
         }
        }
        System.out.println(maxProfit);
    }
}
