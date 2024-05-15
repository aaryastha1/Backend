package com.example.demo;

public class CircularQueue {
    int front = -1;
    int rear = -1;
    int size;
    int queue[];
    public CircularQueue(int size) {
        this.size = size;
        queue = new int[size];
    }
    boolean isFull() {
        return (rear+1) % size == front;
    }

    void enqueue(int data) {
        if(isFull()){
            System.out.println("Queue is full");

        }
        else{
            if(front==-1){
                front = 0;
            }
            rear = (rear+1) % size;
            queue[rear] = data;
        }

    }
    boolean isEmpty(){
        return(front==-1&&rear==-1);
    }
    int dequeue() {
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        if(front==rear){
            int temp=front;
            front=rear=-1;
            return queue[temp];
        }
        int temp=front;
        front=(front+1)%size;
        return queue[temp];
    }

}
