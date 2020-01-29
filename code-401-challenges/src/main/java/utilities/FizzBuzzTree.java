package utilities;

public class FizzBuzzTree {
    Tree answer = new Tree();
    public Tree fizzBuzzTree(Tree tree) {
        answer.root = fizzBuzzTreeHelper(answer.root);
        return answer;
    }

    private TreeNode fizzBuzzTreeHelper(TreeNode root) {
        if (root == null) {
            return null;
        } else {
            TreeNode answer = new TreeNode();
            if (root.getValue() % 15 == 0) {
                answer.setValue("fizzbuzz");
            } else if (root.getValue() % 5 == 0) {
                answer.setValue("buzz");
            } else if (root.getValue() % 3 == 0) {
                answer.setValue("fizz");
            } else {
                answer.setValue(root.getValue().toString());
            }
        }
    }

    public String toString() {
        return this.root == null ? "." : this.root.toString();
    }
}
