package com.company.Queues;

import java.util.Stack;

public class QueueUsingStack {


    public static void  main(String[] args) {
        myQueue q = new myQueue();
        q.enqueue(4);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println(q.deque());
        System.out.println(q.deque());
        System.out.println(q.deque());
        System.out.println(q.deque());
    }
}
