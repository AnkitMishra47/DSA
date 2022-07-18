package com.company.Basic;

import java.util.Stack;
import java.util.function.Predicate;

public class InfixtoPostfix {
    public static void main(String[] args) {
        String str = "2*5/(5+1)*6";
        System.out.println(2*5/(5+1)*6 );
        String nstr = iToF(str);
        System.out.println("\n"+nstr);
        System.out.println(solve(nstr));
    }
    static String iToF(String str){
        char[] arr = str.toCharArray();
        int i = 0 ;
        Stack<Character> s = new Stack<>();
        String nstr = "";
        while (i<arr.length){
            char ch = str.charAt(i);
            if (ch=='('){
                s.push(ch);
            }
            else  if (isOp(ch)){
                if (s.isEmpty()) {
                    s.push(ch);
                    i++;
                    continue;
                }
                 if (!Prec(ch , s.peek())){
                     char e = s.pop();
                     nstr += e;
                     System.out.print(e);

                 }
                 s.push(ch);
            }else if (ch == ')'){
                while (!s.isEmpty() && s.peek()!='('){
                    char e = s.pop();
                    nstr += e;
                    System.out.print(e);
                }
                s.pop();
            }
            else {
                nstr += ch;
                System.out.print(ch);
            }
            i++;
        }
        while (!s.isEmpty()){
             char e = s.pop();
             nstr += e;
             System.out.print(e);
        }
        return nstr;
    }
    static boolean isOp(char ch){
        return ch== '+' || ch== '-'|| ch=='*' || ch== '/' ;
    }
    static boolean Prec(char a , char b){
        int vA = 0 ;
        int vB = 0 ;
        if (a=='+' || a=='-' ){
            vA = 1;
        }
        else if (a=='/' || a=='*'){
            vA = 2;
        }
        if (b=='+' || b=='-' ){
            vB= 1;
        }
        else if (b=='/' || b=='*'){
            vB = 2;
        }
        return vA > vB;
    }
    static int solve(String str){
        Stack<Integer> s = new Stack<>();
        int i = 0;
        while (i <str.length()){
            char ch = str.charAt(i);
            if (isOp(ch)){
                int  a = s.pop();
                int b = s.pop();
                s.push(compute(b,a,ch));
            }
            else {
                int a = Integer.parseInt(String.valueOf(ch));
                s.push(a);
            }
            i++;
        }
        return s.pop();
    }
    static int compute(int A , int B, char c ){

        return switch (c) {
            case '*' -> A * B;
            case '+' -> A + B;
            case '-' -> A - B;
            default -> A / B;
        };
    }
}
