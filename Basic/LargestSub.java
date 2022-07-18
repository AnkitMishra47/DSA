package com.company.Basic;

import java.util.Arrays;
import java.util.Stack;

public class LargestSub {
    public static void main(String[] args) {
        int[][] arr ={ {1,1,0,1,1},
                {1,1,1,1,1},
                {0,1,1,1,1},
                {1,1,1,1,1},
                {1,0,1,1,1},
                {1,1,1,1,1},
        };
//        int[] prev = arr[0];
//        int MaxArea = 1;
//        for (int i = 1; i < arr.length ; i++) {
//            prev = compute(prev , arr[i]);
//            int area = maxArea(prev);
//            MaxArea = Math.max(area , MaxArea);
//        }
//        System.out.println(MaxArea);
        char c =  '0';

    }

    private static int[] addArr(int[] prev, int[] arr) {
        int [] nArr = new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]!=0){
               nArr[i] =  prev[i] + arr[i];
            }
            else {
                nArr[i] = 0 ;
            }
        }
        return nArr;
    }

    static int findMaxArea(int[] arr ){
        Stack<Integer> s = new Stack<>();
        int[] prev = new int[arr.length];
        Arrays.fill(prev , -1);
        int i = 0 ;
        while (i < arr.length){
            int e = i;
            if (s.isEmpty()){
                s.push(e);
                i++;
            }
            else if (arr[s.peek()] < arr[e]){
                prev[i] = s.peek();
                s.push(e);
                i++;
            }
            else {
                s.pop();
            }

        }
        int[] next = new int[arr.length];
        Arrays.fill(next , arr.length);
        s.removeAllElements();
        i = 0 ;
        while (i < arr.length){
            int e = arr.length-1-i;
            if (s.isEmpty()){
                s.push(e);
                i++;
            }
            else if (arr[s.peek()] < arr[e]){
                next[arr.length-1-i] = s.peek();
                s.push(e);
                i++;
            }
            else {
                s.pop();
            }

        }

        int res = 0;
        for (int j = 0; j <arr.length ; j++) {
            int area = (next[j] - prev[j] - 1)*arr[j];
            res = Math.max(res,area);
        }

        return res;
    }
}
