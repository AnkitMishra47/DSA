package com.company.StackAndQueues;

import java.util.Stack;

public class ReverseAString {
    public static void main(String[] args) {
        String str = "abcd";
        str  = reverse(str);
        System.out.println(str);
    }
    static String reverse(String str){
        Stack<Character> stack = new Stack<>();
        int i = 0 ;
        while (i < str.length()){
            stack.push(str.charAt(i));
            i++;
        }
        String nstr="";
        while (!stack.isEmpty()){
            nstr =  nstr +stack.pop();
        }
        return nstr;
    }
}
