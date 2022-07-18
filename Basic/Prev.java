package com.company.Basic;

import java.util.Arrays;
import java.util.Stack;

public class Prev {
    public static void main(String[] args) {
        int[] arr =  { 3, 1 , 2 ,4};
        int[] left  = getleft(arr);
        int[] right = getRight(arr);
        System.out.println(Arrays.toString(left) +  "  " + Arrays.toString(right)  );
    }
    static int[] getleft(int[] arr){
        int[] left = new int[arr.length];
        Arrays.fill(left , -1);
        Stack<Integer> s = new Stack<>();
        int i = 0 ;
        while(i < arr.length ){
            if (s.isEmpty()){
                s.push(i);
                i++;
                continue;
            }
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]){
                 s.pop();
            }
            if (!s.isEmpty())
            left[i] = s.peek();
            s.push(i);
            i++;
        }


        return left;
    }
    static int[] getRight(int[] arr){
        int[] right = new int[arr.length];
        Arrays.fill(right , arr.length);
        Stack<Integer> s = new Stack<>();
        int i = 0 ;
        while(i < arr.length ){
            int e = arr.length -1-i;
            if (s.isEmpty()){
                s.push(e);
                i++;
                continue;
            }
            while (!s.isEmpty() && arr[s.peek()] >= arr[e]){
                s.pop();
            }
            if (!s.isEmpty())
                right[e] = s.peek();
            s.push(e);
            i++;
        }
return right;
    }
}
