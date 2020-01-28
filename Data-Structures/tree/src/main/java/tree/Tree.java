package tree;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class Tree {

    public LinkedList<Integer> preOrder(Node root) {
        // start list of values in tree
        LinkedList<Integer> valuesInTree = new LinkedList<>();

        // add current root to tree
        valuesInTree.add(root.getValue());

        // if left/right isn't null, call preorder on left/right
        if (root.getLeft() != null) {
            valuesInTree.addAll(preOrder(root.getLeft()));
        }
        if (root.getRight() != null) {
            valuesInTree.addAll(preOrder(root.getRight()));
        }

        // return list
        return valuesInTree;
    }

    public LinkedList<Integer> inOrder(Node root) {
        LinkedList<Integer> valuesInTree = new LinkedList<>();
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
        LinkedList<Integer> valuesInTree = new LinkedList<>();
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
