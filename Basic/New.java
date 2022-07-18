package com.company.Basic;

import java.util.Stack;

public class New
{
    public static void main(String[] args) {
String s1 = "acbabbc";
String s2 = "";


        System.out.println(CheckStr("ab##" , "c#d#" , "",""));
    }
    static boolean CheckStr(String s1 , String s2 , String p1 , String p2){
        if(s1.isEmpty() && s2.isEmpty()){

            return p1.equals(p2);
        }
        char ch1 =0,ch2= 0;
        if(!s1.isEmpty()) {
             ch1 = s1.charAt(0);
        }
        if(!s2.isEmpty()) {
             ch2 = s2.charAt(0);
        }

        if(ch1 == '#'){
            if(p1.length() > 0)
            p1 = p1.substring(0 , p1.length() -1);
        }
        else{
            if(!s1.isEmpty())
            p1 = p1 + ch1;

        }

        if(ch2 == '#'){
            if (p2.length() > 0)
            p2 = p2.substring(0 , p2.length() -1);
        }
        else{
            if(!s2.isEmpty())
            p2 = p2+ch2;
        }
        if(!s1.isEmpty())
            s1 = s1.substring(1);
        if(!s2.isEmpty())
            s2 = s2.substring(1);
        return CheckStr(s1,s2,p1,p2);
    }
   static int minimumSwap(String s1, String s2) {
        int x1 = 0, x2 = 0, y1 = 0, y2 = 0;
        for(int i = 0; i < s1.length(); i++){
            char a = s1.charAt(i);
            char b = s2.charAt(i);
            if(a != b){
                if(a == 'x')x1++;
                else y1++;
                if(b == 'x')x2++;
                else y2++;
            }
        }
        if (((x1 + x2) & 1 )!= 0 || ((y1 + y2) & 1)!= 0 )return -1;
        return x1/2 + y1/2 + (x1 % 2) * 2;
    }
    static String check(String str){
        Stack<Character> stack = new Stack<>();
        char[] arr = str.toCharArray();
        for (char e : arr
             ) {
            if (e=='#'){
                stack.pop();
                break;
            }
            stack.push(e);
        }
        return String.valueOf(stack);
    }
}
