package utilities;

public class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;
    String string;

    public TreeNode() {
        this.string = null;
        this.left = null;
        this.right = null;
    }

    // if value, left and right specified
    public TreeNode(int value, TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    // if only value specified
    public TreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public int getValue() {
        return value;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setString(String string) {this.string = string; }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}

