package utilities;

import java.util.ArrayList;

public class Tree {

    TreeNode root;

    public Tree() {
        this.root = null;
    }

    public Tree(TreeNode root) {
        this.root = root;
    }

    public ArrayList<Integer> preOrder(TreeNode root) {
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

    public ArrayList<Integer> inOrder(TreeNode root) {
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

    public ArrayList<Integer> postOrder(TreeNode root) {
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
}
