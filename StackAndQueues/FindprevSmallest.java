package com.company.StackAndQueues;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class FindprevSmallest {
    public static void main(String[] args) {
        int[] arr = {4,2,1,5,6,3,2,4,2};
//        FindSmall(arr);
//        FindSmallNext1(arr);
          Prac1(arr);
//          Prac2(arr);
//          Prac3(arr);
//          Prac4(arr);
    }
    // Using Stack
    static void FindSmall(int[] arr){
        Stack<Integer> stack = new Stack<>();
        int i  = 0 ;
        int[] ans  = new int[arr.length];
        Arrays.fill(ans , -1);
        while (i < arr.length){
            if (stack.isEmpty()){
                ans[i] = -1;
                stack.push(arr[i]);
                i++;
            }
           else if(arr[i] > stack.peek()){
                ans[i] = stack.peek();
                stack.push(arr[i]);
                i++;
            }
           else {
               stack.pop();
            }

        }
        System.out.println(Arrays.toString(ans));

    }
    static void FindSmallNext(int[] arr){
        Stack<Integer> stack = new Stack<>();
        int i  = 0 ;
        int[] ans  = new int[arr.length];
        Arrays.fill(ans , -1);
        while (i < arr.length){
            if (stack.isEmpty()){
                ans[ans.length-1-i] = -1;
                stack.push(arr[arr.length-1-i]);
                i++;
            }
            else if(arr[arr.length - 1 - i] > stack.peek()){
                ans[ans.length-1-i] = stack.peek();
                stack.push(arr[arr.length-1 -i]);
                i++;
            }
            else {
                stack.pop();
            }

        }
        System.out.println(Arrays.toString(ans));

    }
    static void FindSmallNext1(int[] arr){
        Stack<Integer> stack = new Stack<>();
        int i  = 0 ;
        int[] ans  = new int[arr.length];
        Arrays.fill(ans , -1);
        while (i < arr.length){
            if(stack.isEmpty()){
                stack.push(arr[arr.length-1-i]);
                 i++;
            }
            else if(arr[arr.length -1-i]  > stack.peek()){
                ans[ans.length-1-i] = stack.peek();
                stack.push(arr[arr.length-1 -i]);
                i++;
            }
            else {
                stack.pop();
            }
        }
        for(int e  : ans){
            System.out.print(e+" ");
        }

    }

    // Prev Small
    static void Prac1(int[] arr){
        Stack<Integer> s = new Stack<>();
        int[] prev = new int[arr.length];
        Arrays.fill(prev,-1);
        int i = 0 ;
        while (i< arr.length){
            int e = arr[i];
           if (s.isEmpty()){
               s.push(e);
           }
            else if (e > s.peek()){
                prev[i] = s.peek();
                s.push(e);
            }
            else {
                while (!s.isEmpty() && s.peek() > e ){
                    s.pop();
                }
                if (!s.isEmpty())
                prev[i] = s.peek();
                s.push(e);
            }
            i++;
        }
        System.out.println(Arrays.toString(prev));
    }
    // Next Greater
    static void Prac2(int[] arr){
        Stack<Integer> s = new Stack<>();
        int[] prev = new int[arr.length];
        Arrays.fill(prev,-1);
        int i = 0 ;
        while (i< arr.length){
            int e = arr[arr.length-1-i];
            if (s.isEmpty()){
                s.push(e);
            }
            else if (e < s.peek()){
                prev[prev.length-1-i] = s.peek();
                s.push(e);
            }
            else {
                while (!s.isEmpty() && s.peek() < e ){
                    s.pop();
                }
                if (!s.isEmpty())
                    prev[prev.length-1-i] = s.peek();
                s.push(e);
            }
            i++;
        }
        System.out.println(Arrays.toString(prev));
    }
    //Prev Greater
    static void Prac3(int[] arr){
        Stack<Integer> s = new Stack<>();
        int[] prev = new int[arr.length];
        Arrays.fill(prev,-1);
        int i = 0 ;
        while (i< arr.length){
            int e = arr[i];
            if (s.isEmpty()){
                s.push(e);
            }
            else if (e < s.peek()){
                prev[i] = s.peek();
                s.push(e);
            }
            else {
                while (!s.isEmpty() && s.peek() < e ){
                    s.pop();
                }
                if (!s.isEmpty())
                    prev[i] = s.peek();
                s.push(e);
            }
            i++;
        }
        System.out.println(Arrays.toString(prev));
    }
    //Next Small
    static void Prac4(int[] arr){
        Stack<Integer> s = new Stack<>();
        int[] prev = new int[arr.length];
        Arrays.fill(prev,-1);
        int i = 0 ;
        while (i< arr.length){
            int e = arr[arr.length-1-i];
            if (s.isEmpty()){
                s.push(e);
            }
            else if (e > s.peek()){
                prev[arr.length-1-i] = s.peek();
                s.push(e);
            }
            else {
                while (!s.isEmpty() && s.peek() > e ){
                    s.pop();
                }
                if (!s.isEmpty())
                    prev[arr.length-1-i] = s.peek();
                s.push(e);
            }
            i++;
        }
        System.out.println(Arrays.toString(prev));
    }
    // Brute force
    static void FindprevSmall(int[] arr){
        int [] ans = new int[arr.length];
        int k = 0 ;
        Arrays.fill(ans , -1);
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i; j >= 1; j--) {
                if (arr[j-1] < arr[i]){
                    ans[i] = arr[j-1];
                    break;
                }
            }
        }
        for (int e : ans
             ) {
            System.out.print(e+" ");
        }
    }
}
