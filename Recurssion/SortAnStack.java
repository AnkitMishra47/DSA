package com.company.Recurssion;

import java.util.Stack;

public class SortAnStack {


    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(5);
        stack.push(3);
        stack.push(2);
        stack.push(4);
        stack.push(6);
        stack = sort(stack);
        stack = delM(stack, stack.size()/2 + 1);
        System.out.println(String.valueOf(stack));
    }

 // sort a stack
   private  static Stack<Integer> sort(Stack<Integer> s ){
        if (s.size()==1){
            return s;
        }
        int k = s.pop();
        return insert(sort(s),k);
    }
    static Stack<Integer> insert(Stack<Integer> s , int k ){
        if (s.isEmpty()){
            s.push(k);
            return s;
        }
        if (s.peek()<=k){
            s.push(k);
            return s;
        }
        int l = s.pop();
        s = insert(s , k);
        s.push(l);
        return s;
    }

    // delete middle
    static Stack<Integer> delM(Stack<Integer> s ,int pos){
        if (s.size() == pos){
            s.pop();
            return s;
        }
        int k = s.pop();


        s =  delM(s,pos);
        s.push(k);
        return s;
    }
}
