package com.company.StackAndQueues;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Text_Editor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        list.size();

        String [] arr = new String[n];

        for (int i = 0; i < n; i++) {
              arr[i] = sc.nextLine();
        }
        System.out.println(Arrays.toString(arr));
        textEditor("" , arr);
    }
    static void textEditor(String s , String[] arr){
        Stack<String> stack = new Stack<>();

        for (int i = 0; i <arr.length ; i++) {
            char ch = arr[i].charAt(0);
            switch (ch){
                case '1' :
                    s =  s + arr[i].substring(2);
                    break;
                case '2' :
                    delete(s , arr[i].charAt(2));
                    break;
                case '3' :
                    print(s , arr[i].charAt(2));
                case '4' :
                    s = stack.pop();
                    break;
                default:
                    System.out.println("invalid cmd");
            }
            stack.push(s);
        }

    }
    static String delete(String s , char ch){
        int del = Integer.parseInt(String.valueOf(ch));
        String nstr ="";
        for (int i = 0; i <s.length() ; i++) {
            if (i==del)continue;
            nstr = nstr + s.charAt(i);
        }
        return nstr ;
    }
    static void print(String s , char ch){
        int del = Integer.parseInt(String.valueOf(ch));
       String nstr = "";
        for (int i = 0; i <s.length() ; i++) {
            if (i==del+1)break;
            nstr = nstr + s.charAt(i);
        }
        System.out.println(nstr);
    }
}
