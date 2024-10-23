package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MyCircularQueue {
    Integer[] que;//Array<Integer> que;
    int front;
    int rear;
    int size;

    public MyCircularQueue(int k) {
        que = new Integer[k];
        front = -1;
        rear = -1;
        size = k;
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        if (isEmpty()) {
            front++;
        }
        rear++;
        if(rear == size) {
            rear = 0;
        }
        que[rear] = value;

        return true;

        //throw new UnsupportedOperationException("Not implemented yet");
    }

    public boolean deQueue() {
        if(isEmpty()) {
            return false;
        }
        front++;
        if (front == size) {
            front = -1; //0;
        }
        return true;
    }

    public int Front() {
        if (isEmpty()) return -1;
        return que[front];

    }

    public int Rear() {
        if(isEmpty()) {
            return -1;
        }
        return que[rear];

    }

    public boolean isEmpty() {
        return front == -1;//rear < front || front == -1;
    }

    public boolean isFull() {

        return rear >= size-1;
        //throw new UnsupportedOperationException("Not implemented yet");
    }
}
