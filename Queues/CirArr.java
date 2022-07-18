package com.company.Queues;

public class CirArr {
    int[] arr;
    int size;
    int rear =-1;
    int front =-1;

    public CirArr(int size) {
        this.size = size;
        arr = new int[size];
    }
    void enque(int item){
        if (isFull()){
            throw new RuntimeException("Queue is full");
        }
        // first ele
        if (front==-1){
            front = 0 ;
        }
        rear = (rear+1)%size;
        arr[rear] = item;
    }
    void deque(){
        if (isEmpty()){
            throw new RuntimeException("Can't throw from a Empty queue");
        }
        System.out.println(arr[front]);
        if (front==rear){
             front = rear = -1;
        }
        else
        front=(front+1)%size;
    }
    boolean isFull(){
        return front == (rear+1)%size;
    }
    boolean isEmpty(){
        return front==-1 && rear==-1;
    }

    public static void main(String[] args) {
        CirArr q = new CirArr(3);
q.enque(2);
        q.deque();
        q.deque();
        q.deque();
    }
}
