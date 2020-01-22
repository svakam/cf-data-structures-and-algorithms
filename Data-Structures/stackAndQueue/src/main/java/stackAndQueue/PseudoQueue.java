package stackAndQueue;

public class PseudoQueue {

    // initialize variables and instantiate stack
    Stack stackEnqueue;
    Stack stackDequeue;

    public PseudoQueue() {
        this.stackEnqueue = new Stack();
        this.stackDequeue = new Stack();
    }

    public void enqueue(int newValue) {
        // if enqueue stack empty and dequeue filled, empty out dequeue, put into enqueue, and enqueue new node
        if (stackEnqueue.isEmpty() && !stackDequeue.isEmpty()) {
            while (!stackDequeue.isEmpty()) {
                int value = stackDequeue.pop();
                stackEnqueue.push(value);
            }
        }
        stackEnqueue.push(newValue);
    }

    public int dequeue() {
        // if enqueue stack filled and dequeue empty, empty out enqueue and fill dequeue, then dequeue
        if (!stackEnqueue.isEmpty() || stackDequeue.isEmpty()) {
            while (!stackEnqueue.isEmpty()) {
                int value = stackEnqueue.pop();
                stackDequeue.push(value);
            }
        }
        return stackDequeue.pop();
    }
}
