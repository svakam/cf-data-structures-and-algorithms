package stackAndQueue;

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
//    public int dequeue() {
//
//    }

    // returns node value in front of queue without removing it from queue
//    public int peek() {
//
//    }

    //
//    public boolean isEmpty() {
//
//    }
}
