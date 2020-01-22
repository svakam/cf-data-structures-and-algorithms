package stackAndQueue;

import java.util.NoSuchElementException;

public class Queue {
    Node front;
    Node rear;

    // adds new node to back of queue
    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (front == null) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
    }

    // removes node from front of the queue
    public int dequeue() {
        Node temp = front;
        if (front == null) {
            throw new NoSuchElementException("Cannot dequeue from an empty queue");
        }
        front = front.next;
        temp.next = null;
        return temp.value;
    }

    // returns node value in front of queue without removing it from queue
    public int peek() {
        if (front == null) {
            throw new NoSuchElementException("Cannot peek with an empty queue");
        }
        return front.value;
    }

    // return boolean for empty vs non empty queue
    public boolean isEmpty() {
        return front == null;
    }
}
