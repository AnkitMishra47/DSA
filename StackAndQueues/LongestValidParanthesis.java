package com.company.StackAndQueues;

import java.util.ArrayList;
import java.util.Set;
import java.util.Stack;

public class LongestValidParanthesis {
    public static void main(String[] args) {
        String str = "(()(()()()";
        System.out.println(checker(str)*2);

    }
  /*   static void subsequence(String str){
        char[] arr = str.toCharArray();
        String nstr = "";
        for (int i = 0; i <str.length() ; i++) {
            for (int j = i; j <str.length() ; j++) {
                nstr =nstr + arr[j];
                System.out.print(nstr);
                System.out.println();
            }
      nstr = "";
        }
    }
    static int checker(String str){
        Stack<Character> stack = new Stack<>();
        char[] arr = str.toCharArray();
        ArrayList<Integer> close = new ArrayList<>();
        ArrayList<Integer> open = new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] == '('){
                open.add(i);
            }
            else {
                close.add(i);
            }
        }
        System.out.println(open);
        System.out.println(close);
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i <Math.min(open.size() , close.size()) ; i++) {
           if (open.size() < close.size() && contains(close , open.get(i)+1)){
               ans.add(open.get(i));
           }
           else if (contains(open , close.get(i)-1)){
               ans.add(close.get(i));
           }
        }
        if (ans.isEmpty()){
            return 0 ;
        }

        int count = 0 ,max = 0;
        for (int i = 0; i <ans.size()-1 ; i++) {
            if (ans.get(i+1) - ans.get(i) == 2  ){
               count++;
               max = Math.max(count , max);
            }
            else {
                count = 0;
            }
        }
        return max+1;
    }
    static boolean contains(ArrayList<Integer> arr , int k){
        for (int e : arr
             ) {
            if (e == k ){
                return true;
            }
        }
        return false;
    }*/
    static int checker(String str){
        Stack<Character> stack = new Stack<>();
        int i = 0;
        int count = 0 ,result = 0;
        while (i<str.length()){
            char ch = str.charAt(i);
            if (ch == '('){
                stack.push(ch);
            }
            if (ch==')'){
                while (  !stack.isEmpty() && stack.peek() !='('){
                    stack.pop();
                }

                if (!stack.isEmpty() && stack.peek() =='('){

                    count++;
                    if (count > result)
                    result = count;
                    stack.pop();
                }
                else {
                    count= 0 ;
                }
            }
            i++;

        }

        return result;
    }
}
