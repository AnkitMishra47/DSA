package com.company.Queues;

import java.util.Stack;

public class myQueue{
    Stack<Integer> s1= new Stack<>();
    Stack<Integer> s2= new Stack<>();

    void enqueue(int item){
        s1.push(item);
    }
    int deque(){
        if (s1.isEmpty()){
            throw new RuntimeException("Empty queue");
        }
        while (!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int res = s2.pop();
        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return res;
    }
}
