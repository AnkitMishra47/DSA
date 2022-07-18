package com.company.RSL;

import java.util.ArrayList;

public class stock {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,5,6};

        maxProfit(arr);
    }
    static void  maxProfit(int[] arr){
        if (arr.length == 1) return;

        int i = 0 ;
        int n = arr.length ;
        boolean isFound = false ;

        // Interval type arraylist ;
        ArrayList<Interval> ans = new ArrayList<>();

        while(i < n-1){
           while(i < n-1 && arr[i] >= arr[i+1] ){
               i++ ;
           }
           if (i == n-1) return;

           Interval e = new Interval();
           e.buy = i++ ;

           while (i < n && arr[i-1] <= arr[i]){
               i++;
           }
           e.sell = i - 1 ;
           ans.add(e);

           isFound = true ;
        }
        if (isFound){
            for (int j = 0 ; j < ans.size() ; j++ ){
                System.out.println("Buy value : " + (ans.get(j).buy+1));
                System.out.println("sell value : " + (ans.get(j).sell+1));
                System.out.println();
            }
        }
        else {
            System.out.println("No profitable days found");
        }


    }
    static class Interval{
        int buy , sell ;
    }
}
