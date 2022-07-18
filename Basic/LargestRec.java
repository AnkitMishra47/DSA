package com.company.Basic;

import java.sql.Array;
import java.util.Arrays;
import java.util.Stack;

public class LargestRec {
    public static void main(String[] args) {
        int[] arr = {4,2,1,5,6,3,2,4,2};
        int area = findMaxArea(arr);
        System.out.println(area);
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
        System.out.println(Arrays.toString(prev));
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
        System.out.println(Arrays.toString(next));
        int res = 0;
        for (int j = 0; j <arr.length ; j++) {
            int area = (next[j] - prev[j] - 1)*arr[j];
            res = Math.max(res,area);
        }

        return res;
    }
}
