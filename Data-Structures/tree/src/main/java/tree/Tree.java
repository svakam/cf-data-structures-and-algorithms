package tree;

import java.util.LinkedList;

public class Tree {
    LinkedList<Integer> valuesInTree = new LinkedList<>();
    public LinkedList<Integer> preOrder(Node root) {
        valuesInTree.add(root.getValue());
        if (root.getLeft() != null) {
            valuesInTree.addAll(preOrder(root.getLeft()));
        }
        if (root.getRight() != null) {
            valuesInTree.addAll(preOrder(root.getRight()));
        }
        return valuesInTree;
    }

    public LinkedList<Integer> inOrder(Node root) {
        if (root.getLeft() != null) {
            valuesInTree.addAll(inOrder(root.getLeft()));
        }
        valuesInTree.add(root.getValue());
        if (root.getRight() != null) {
            valuesInTree.addAll(inOrder(root.getRight()));
        }
        return valuesInTree;
    }

    public LinkedList<Integer> postOrder(Node root) {
        if (root.getLeft() != null) {
            valuesInTree.addAll(postOrder(root.getLeft()));
        }
        if (root.getRight() != null) {
            valuesInTree.addAll(postOrder(root.getRight()));
        }
        valuesInTree.add(root.getValue());
        return valuesInTree;
    }
}
