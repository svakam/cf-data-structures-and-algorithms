package tree;

import java.lang.reflect.Array;
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
        Queue<Node> valuesInTree = new LinkedList<>();
        ArrayList<Integer> answer = new ArrayList<>();
        // if root on tree exists, enqueue it
        if (root != null) {
            valuesInTree.add(root);
        }
        // while queue is filled, dequeue the front and add it to answer list
        while (!valuesInTree.isEmpty()) {
            Node dequeued = valuesInTree.remove();
//            System.out.println(dequeued);
            answer.add(dequeued.getValue());

            // if dequeued's left exists, add the left value to queue, if root's right exists, add right value to queue
            if (dequeued.getLeft() != null) {
                valuesInTree.add(dequeued.getLeft());
            }
            if (dequeued.getRight() != null) {
                valuesInTree.add(dequeued.getRight());
            }
        }
        return answer;
    }

    public int findMaxValue(Node root) {
        int maxValue = Integer.MIN_VALUE;
        return findMaxValueHelper(root, maxValue);
    }

    private int findMaxValueHelper(Node root, int maxValue) {
        if (root == null) {
            return maxValue;
        }
        maxValue = root.getValue();
        if (root.getLeft() != null) {
            int leftSide = findMaxValueHelper(root.getLeft(), maxValue);
            if (leftSide > maxValue) {
                maxValue = leftSide;
            }
        }
        if (root.getRight() != null) {
            int rightSide = findMaxValueHelper(root.getRight(), maxValue);
            if (rightSide > maxValue) {
                maxValue = rightSide;
            }
        }
        return maxValue;
    }
}
