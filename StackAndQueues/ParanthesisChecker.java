package com.company.StackAndQueues;

import java.util.Stack;

public class ParanthesisChecker {
    public static void main(String[] args) {
        String str =  "()[]";
        System.out.println( check(str));
    }
    static boolean check(String str){
        Stack<Character> stack = new Stack<>();
        int i = 0 ;
        while (i < str.length()){
            if (stack.isEmpty()){
                stack.push(str.charAt(i));
                i++;
            }
            else if (isOpen(str.charAt(i))){
                stack.push(str.charAt(i));
                i++;
            }
            else if (isMatching(stack.peek() , str.charAt(i))){
                stack.pop();
                i++;
            }
            else {
                return false;
            }
        }
return true;
    }
    static boolean isOpen(char c ){
        return c =='(' || c=='{'||c=='[';
    }
    static boolean isMatching(char a,char  b ){
        return ( a=='(' && b==')') || a=='{' && b=='}' || a=='[' && b==']' ;
    }
}
