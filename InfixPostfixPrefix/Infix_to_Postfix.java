package com.company.InfixPostfixPrefix;

import java.util.Stack;

public class Infix_to_Postfix {
    public static void main(String[] args) {
         String str = "a+b-(c^d+e)^(f*g-h)+i";
         convert(str);
        }
        static void convert(String str){
            Stack<Character> stack = new Stack<>();
            int i = 0 ;
            while (i < str.length()){
                char c = str.charAt(i);
                if (isOperator(c)){
                    if (stack.isEmpty())
                    stack.push(c);
                    else {
                        if (ishigher(c,stack.peek())){
                            stack.push(c);
                        }
                        else {
                            while(!stack.isEmpty() && !ishigher(c,stack.peek())){
                                System.out.print(stack.pop());
                            }
                            stack.push(c);
                        }
                    }
                }
                else if (c=='('){
                    stack.push(c);
                }
                 else if (c==')'){
                    while (stack.peek()!='('){
                        System.out.print(stack.pop());
                    }
                    stack.pop();
                }
                else {
                    System.out.print(c);
                }
                i++;
            }
            while (!stack.isEmpty()){
                System.out.print(stack.pop());
            }
        }

    private static boolean isOperator(char c) {
        return c == '+' || c=='-' || c=='*'|| c=='/'|| c=='^' ;
    }

    private static boolean ishigher(char a ,char b) {

        int preOfA = 0,preOfB=  0 ;
        if (a=='+' || a=='-'){
            preOfA = 1;
        }
        else if (a=='*'|| a=='/'){
            preOfA = 2;
        }
        else if (a=='^'){
            preOfA = 3;
        }
        if (b=='+' || b=='-'){
            preOfB = 1;
        }
        else if (b=='*'|| b=='/'){
            preOfB = 2;
        }
        else if (b=='^'){
            preOfB = 3;
        }
        return preOfA > preOfB;
    }
}
//a+b-(c^d+e)^(f*g-h)+i-(j^k*l-i+o*p)^(f*g/h+y)*(a+b-(c^d+e)^(f*g-h)+i-(j^k*l-i+o*p)^(f*g/h+y))
//ab+cd^e+fg*h-^-i+jk^l*i-op*+fg*h/y+^ab+cd^e+fg*h-^-i+jk^l*i-op*+fg*h/y+^-*-
//ab+cd^e+fg*h-^i+jk^l*i-op*+fg*h/y+^ab+cd^e+fg*h-^i+jk^l*i-op*+fg*h/y+^--*--