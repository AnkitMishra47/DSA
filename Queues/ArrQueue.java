package com.company.Queues;

public class ArrQueue {
    int[] arr ;
    int capacity;
    int rear;

    public ArrQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        this.rear = -1;
    }
    void enqueue(int item){
        if (rear==capacity-1){
            throw new RuntimeException("Queue is already full");
        }
        rear++;
        arr[rear] = item;
    }
    void dequeue(){
        if (rear==-1){
            throw new RuntimeException("Queue is Empty");
        }
        System.out.println(arr[0]);
        for (int i = 0; i <arr.length-1 ; i++) {
            arr[i] = arr[i+1];
        }
        rear--;
    }
    void peek(){
        if (arr.length!=0)
        System.out.println(arr[0]);
        else {
            throw new RuntimeException("Queue is Empty");
        }
    }

    public static void main(String[] args) {
        ArrQueue q = new ArrQueue(5);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(1);
        q.enqueue(4);
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
    }
}
