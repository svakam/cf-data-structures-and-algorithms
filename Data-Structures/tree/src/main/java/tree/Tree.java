package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Tree {

    public ArrayList<Integer> preOrder(Node root) {
        // start list of values in tree
        ArrayList<Integer> valuesInTree = new ArrayList<>();

        // add current root to tree
        valuesInTree.add(root.getValue());

        // if left/right isn't null, call preorder on left/right
        if (root.getLeft() != null) {
            valuesInTree.addAll(preOrder(root.getLeft()));
        }
        if (root.getRight() != null) {
            valuesInTree.addAll(preOrder(root.getRight()));
        }

        return valuesInTree;
    }

    public ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> valuesInTree = new ArrayList<>();
        if (root.getLeft() != null) {
            valuesInTree.addAll(inOrder(root.getLeft()));
        }

        valuesInTree.add(root.getValue());

        if (root.getRight() != null) {
            valuesInTree.addAll(inOrder(root.getRight()));
        }

        return valuesInTree;
    }

    public ArrayList<Integer> postOrder(Node root) {
        ArrayList<Integer> valuesInTree = new ArrayList<>();

        if (root.getLeft() != null) {
            valuesInTree.addAll(postOrder(root.getLeft()));
        }
        if (root.getRight() != null) {
            valuesInTree.addAll(postOrder(root.getRight()));
        }

        valuesInTree.add(root.getValue());

        return valuesInTree;
    }

    public ArrayList<Integer> breadthFirst(Node root) {
        ArrayList<Integer> valuesInTree = new ArrayList<>();

        // instantiate queue
        Queue<Integer> queue = new LinkedList<>();

        // get tree
        // instantiate queue
        // pass in tree's root to queue
        // while queue not empty, dequeue node and store it in temp
        // enqueue left and right child of dequeue node
        // if node doesn't have children, dequeue without further enqueue
    }
}
