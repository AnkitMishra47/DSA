package com.company.Queues;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class priorityQueues {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        queue.offer(1);
        queue.offer(13);
        queue.offer(12);
        queue.remove(13);
        System.out.println(queue.peek());
    }
}
