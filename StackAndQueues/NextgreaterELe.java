package com.company.StackAndQueues;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class NextgreaterELe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        findNextGreater( arr);
    }
    static void findNextGreater(int[] arr){
        Stack<Integer> stack = new Stack<>();
        int i = 0 ;
        int[] ans  = new int[arr.length];
        while (i < arr.length){
            if (stack.isEmpty()){
                stack.push(arr[arr.length-1-i]);
                ans[arr.length-1- i ] = -1;
                i++;
            }
            else if (arr[arr.length-1- i ] < stack.peek()){
              ans[arr.length-1- i ] = stack.peek();
                stack.push(arr[arr.length-1-i]);
                i++;
            }
            else {
                stack.pop();
            }
        }
        for (int e : ans
             ) {
            System.out.print(e+" ");
        }
    }
}
