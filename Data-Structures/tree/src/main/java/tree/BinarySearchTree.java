package tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    // start current
    Node current;

    public void add(int value, Node root) {
        Node newNode = new Node(value);

        // while a leaf hasn't been encountered
        while (root.getLeft() != null && root.getRight() != null)
            // if root's value is less than search value, go left
            if (root.getValue() < value) {
                current = current.getLeft();
            }
        }
    }
}
