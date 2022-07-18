package com.company.Arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class RainWater {
    public static void main(String[] args) {
         int[] arr = {3,1,2,4,0,1,3,2};
       // System.out.println(RainWater(arr));
        System.out.println(Rain(arr));

    }

//    static int RainWater(int[] arr){
//        int[] left = new int[arr.length];
//        int[] right = new int[arr.length];
//        int max = 0 ;
//        for (int i = 0; i <arr.length ; i++) {
//            if (max < arr[i])
//                max = arr[i];
//            left[i] = max;
//        }
//        max = 0;
//        for (int i = arr.length-1; i >= 0 ; i--) {
//            if (max  < arr[i])
//                max = arr[i];
//
//            right[i] = max;
//        }
//        int Height = 0;
//        for (int i = 0; i <arr.length ; i++) {
//            Height += Math.min(left[i] , right[i]) - arr[i];
//        }
//        return Height;
//    }
    static int Rain(int[] arr){
        Stack<Integer> s = new Stack<>();
        int height = 0 ;
        for (int i = 0; i <arr.length ; i++) {
            if (s.isEmpty()){
                s.push(i);
            }
            else if (arr[s.peek()] < arr[i]){
                int poppedHeight = arr[s.pop()];
                int curr = arr[i];
                if (!s.isEmpty())
                height += (Math.min(arr[s.peek()],curr) - poppedHeight)*(i - s.peek() - 1) ;

            }
            s.push(i);
        }
        return height;
    }
}
