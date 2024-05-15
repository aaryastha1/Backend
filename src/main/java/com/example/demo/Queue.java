package com.example.demo;

public class Queue {
    int front = -1;
    int rear = -1;
    int queue[];
    int size;
    Queue(int size) {
        this.size = size;
        queue = new int[size];

    }
    boolean isFull() {
        return rear == size - 1;
    }
    boolean isEmpty() {
        return rear == -1 || front == -1;
    }
    void enqueue(int data) {
        if(isFull()){
            System.out.println("Queue is full");
        }
        else{
            if(front == -1 && rear == -1){
                front=rear=0;
                queue[rear]=data;
            }
            else{
                //rear=rear+1;
                queue[rear]=data;
            }
        }

    }
    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        if(front == rear) {
            int temp=front;
            front =rear -1;
            return queue[temp];
        }
    }


}