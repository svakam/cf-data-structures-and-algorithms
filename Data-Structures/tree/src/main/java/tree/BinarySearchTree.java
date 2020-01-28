package tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree extends Tree {

    Node root;
    public void add(int value) {
        // if empty, add the node here, else go find its spot
        if (this.root == null) {
            this.root = new Node(value);
        } else {
            addHelper(this.root, value);
        }
    }

    private void addHelper(Node root, int value) {
        if (value < root.getValue()) {
            // belongs on left side of root
            if (root.getLeft() == null) {
                root.setLeft(new Node(value));
            } else {
                addHelper(root.getLeft(), value);
            }
        } else if (value > root.getValue()) {
            if (root.getRight() == null) {
                root.setRight(new Node(value));
            } else {
                addHelper(root.getRight(), value);
            }
        }
    }

    public boolean contains(int value) {
        return containsHelper(this.root, value);
    }

    private boolean containsHelper(Node root, int value) {
        if (root == null) {
            return false;
        } else if (root.getValue() == value){
            return true;
        } else if (root.getValue() > value) {
            return containsHelper(root.getLeft(), value);
        } else {
            return containsHelper(root.getRight(), value);
        }
    }
}
