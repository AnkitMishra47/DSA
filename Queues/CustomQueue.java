package com.company.Queues;

import java.util.ArrayDeque;
import java.util.Queue;

public class CustomQueue {
    static Node front;
    static Node rear ;
    int size;

    public CustomQueue() {
        this.size = 0;
    }

    void Insert(int item){
        Node temp = new Node(item);
        if (front == null){
            front = temp;
            rear = front;
            size++;
            return;
         }
         rear.next = temp;
         rear = rear.next;
         size++;
    }
     void Deque(){
         System.out.println(front.value);
         front = front.next;
         size --;
    }
    void display(){
        Node temp = front;
        while (temp!=null){
            System.out.print(temp.value+ "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        CustomQueue q = new CustomQueue();
        Queue<Node> s = new ArrayDeque<>();
//        q.Insert(1);
//        q.Insert(2);
//        q.Insert(3);
//        q.display();
//        q.Deque();
//        q.Deque();
//        q.Deque();
//        q.display();

    }
    static void Ans(Node hrad , Queue<Node> s){

    }
}
class Node{
    int value ;
    Node next ;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}
