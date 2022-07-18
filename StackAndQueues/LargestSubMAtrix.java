package com.company.StackAndQueues;

import java.util.Arrays;
import java.util.Stack;

public class LargestSubMAtrix {
    public static void main(String[] args) {
        int[][] arr =  {{ 1,1,0,1,1},
                        { 1,1,1,1,1},
                        { 0,1,1,1,1},
                        { 1,1,1,1,1},
                        { 1,0,1,1,1},
                        { 1,1,1,1,1}
                   };
        int[] curr = new int[arr[0].length];
        int maxArea = 0;
        for (int i = 0; i <arr.length ; i++) {
             curr = compute(curr , arr[i]);
             maxArea = Math.max(maxArea ,findLargestArea(curr) );
        }
        System.out.println(maxArea);
    }
    static int[] compute(int[] first , int[] second ){
        int[] nArr = new int[first.length];
        for (int i = 0; i < nArr.length; i++) {
            if (second[i]== 0){
                nArr[i] = 0 ;
            }
            else {
                nArr[i] = first[i] + second[i];
            }
        }
        return nArr;
    }
    static int findLargestArea(int[] arr ){
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
     return maxArea;

    }
}
