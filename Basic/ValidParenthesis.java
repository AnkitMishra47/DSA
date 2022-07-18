package com.company.Basic;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String str  = "[{()]";

        System.out.println(validChecker(str));
    }
    static boolean validChecker(String str){
        Stack<Character> s = new Stack<>();
        int i = 0;
        while (i < str.length()){
            char ch = str.charAt(i);
            if (!isOpen(ch)){
                s.push(ch);
            }
            else if (!s.isEmpty()){
            if (!isMatching(ch , s.peek())){
                return false;
            }
            s.pop();
            }
            i++;
        }

        return true;
    }

    private static boolean isOpen(char ch) {
        return ch==']' || ch ==')' || ch== '}';
    }
    static boolean isMatching(char A , char B){
       return (A==')' && B =='(') || (A==']' && B =='[') || (A=='}' && B =='{');
    }
}
