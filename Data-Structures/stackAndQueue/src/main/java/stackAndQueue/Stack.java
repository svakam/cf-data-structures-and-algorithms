package stackAndQueue;

public class Stack {
    Node top = null;

    // pushes new node onto stack
    public void push(int value) {
        Node newNode = new Node(value);

        // if list is empty, push node directly to top, else push node and reset top
        if (top != null) {
            newNode.next = top;
        }
        top = newNode;
    }

    // pops top node off
    public int pop() {
        Node temp = top;
        top = top.next;
        temp.next = null;
        return temp.value;
    }

    // checks what top of stack is
    public int peek() {
        return top.value;
    }

    // checks if stack is empty
    public boolean isEmpty() {
        return top == null;
    }
}
