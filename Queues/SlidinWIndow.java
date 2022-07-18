package com.company.Queues;

import java.util.ArrayDeque;

public class SlidinWIndow {
    public static void main(String[] args) {
        int[] arr = { 4,1,3,5,1,2,3,2,1,1,5};
        FindMaxInWindow(arr,3);
    }
    static void FindMaxInWindow(int[] arr , int k){
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        int i  = 0 ;
        while (i < arr.length){
            if (queue.isEmpty()){
                queue.offer(i);

            }
            else if (arr[queue.peekLast()] > arr[i]){
                queue.offer(i);
            }
            else {
              queue.pollLast();
              continue;
            }

            if (i >=k-1) {
                System.out.print(arr[queue.peek()]+" ");
                queue.remove(i - k + 1);
            }
            i++;
        }
    }
}
