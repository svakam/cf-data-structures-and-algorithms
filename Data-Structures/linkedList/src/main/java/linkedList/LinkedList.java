package linkedList;

public class LinkedList {
    // Within your LinkedList class, include a head property. Upon instantiation, an empty Linked List should be created.
    Node head;
    Node current;

    // Define a method called insert which takes any value as an argument and adds a new node with that value
    // to the head of the list with an O(1) Time performance.
    public void insert(int value) {
        Node newNode = new Node(value);
        // if list is empty, reference new node from head, else add new node to head and reset new node to be 1st node
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            newNode.next = head;
            head = newNode;
            current = head;
        }
    }

    // Define a method called includes which takes any value as an argument and returns a boolean result
    // depending on whether that value exists as a Node’s value somewhere within the list.
    public boolean includes(int value) {
        // start at head
        current = head;
        // traverse with current
        // while current node's next is not null
        while (current != null) {
            // if current node's value is equal to input value, return true; reset current to next node
            if (current.value == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Define a method called toString (or __str__ in Python) which takes in no arguments and returns a string
    // representing all the values in the Linked List, formatted as: "{ a } -> { b } -> { c } -> NULL"
    public String toString() {
        // start at head and initialize string output
        current = head;
        String stringOfValues = "";
        // traverse list
        // while current node is not pointing to null
        while (current != null) {
            // get current value and concatenate it to string
            stringOfValues += "{ " + current.value + " } -> ";
            current = current.next;
        }
        // concatenate NULL to string and return string
        stringOfValues += "NULL";
        return stringOfValues;
    }

    // append(value) adds a new node with a given value to the end of the list
    public void append(int value) {
        // start at head
        current = head;
        // new node
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            // while current node not null, if next is null, insert new node after current
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // insert before adds new node with given new value before specified node
    public void insertBefore(int searchValue, int newValue) {
        // search for node with value
        current = head;
        Node newNode = new Node(newValue);
        while (current != null) {
            if (current.next.value == searchValue) {
                // set new node to node after current and current to new node
                newNode.next = current.next;
                current.next = newNode;
                return;
            }
            current = current.next;
        }
    }

    // insert after adds new node with given new value after specified node
    public void insertAfter(int searchValue, int newValue) {
        current = head;
        Node newNode = new Node(newValue);
        while (current != null) {
            if (current.value == searchValue) {
                newNode.next = current.next;
                current.next = newNode;
                return;
            }
            current = current.next;
        }
    }

    // insert given node k nodes from the end of the list
    public int kthFromEnd(int k) {
        current = head;
        int selectedValue = current.value;
        // get length of list
        int lengthOfList = 0;
        while (current != null) {
            lengthOfList++;
            current = current.next;
        }

        // reset current and traverse node k times from the end and get value of current node
        current = head;
        if (k <= lengthOfList && k > 0) {
            for (int i = 0; i < lengthOfList - k; i++) {
                current = current.next;
            }
            selectedValue = current.value;
        } else {
            System.out.println("Exception: could not run with current search value");
            return -1;
        }
        return selectedValue;
    }
}
