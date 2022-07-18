package com.company.StackAndQueues;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class FindLargestRectangle {
    public static void main(String[] args) {
        int[] arr = { 4,2 };
        findLargestArea(arr);
    }
    static void findLargestArea(int[] arr ){
        Stack<Integer> stack = new Stack<>();
        // prev small
        int i = 0 ;
        int[] prevSmall = new int[arr.length];
        Arrays.fill(prevSmall,-1);
        while (i < arr.length){
            if (stack.isEmpty()){
                stack.push(i);
                i++;
            }
            else if(arr[stack.peek()] < arr[i]){
             prevSmall[i] = stack.peek();
             stack.push(i);
             i++;
            }
            else {
                stack.pop();
            }
        }
        //reset stack
        stack.removeAllElements();
        // next small
        int[] nextSmall = new int[arr.length];
        i = 0 ;
        Arrays.fill(nextSmall,arr.length);
        while (i <arr.length ){
            if (stack.isEmpty()){
                stack.push(arr.length-1-i);
                i++;
            }
            else if (arr[arr.length-1-i] > arr[stack.peek()]){
                nextSmall[arr.length-1-i] = stack.peek();
                stack.push(arr.length-1-i);
                i++;
            }
            else
            {
                stack.pop();
            }
        }
        int maxArea =  1 ;
        for (int j = 0; j <arr.length ; j++) {
          int curr = (nextSmall[j] - prevSmall[j] - 1)*arr[j];
          maxArea = Math.max(curr , maxArea);
        }
        System.out.println(maxArea);
        System.out.println(Arrays.toString(prevSmall)+ "\n" + Arrays.toString(nextSmall));
    }
}
