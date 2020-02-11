package utilities;

public class FizzBuzzTree {

    // instantiate an answer tree
    Tree answer = new Tree();

    // method for fizzbuzz that takes in the original tree
    public Tree fizzBuzzTree(Tree tree) {
        // root of answer tree gets helper result
        answer.root = fizzBuzzTreeHelper(answer.root);
        return answer;
    }

    // helper function takes in root of answer tree
    private TreeNode fizzBuzzTreeHelper(TreeNode root) {
        if (root == null) {
            return null;
        } else {
            TreeNode answer = new TreeNode();
            if (root.getValue() % 15 == 0) {
                answer.setString("fizzbuzz");
            } else if (root.getValue() % 5 == 0) {
                answer.setString("buzz");
            } else if (root.getValue() % 3 == 0) {
                answer.setString("fizz");
            } else {
                System.out.println(root.getValue());
//                answer.setString(root.getValue().toString());
            }
            // recursion
            answer.getLeft() = fizzBuzzTreeHelper(root.getLeft());
            answer.getRight() = fizzBuzzTreeHelper(root.getRight());
            return answer;
        }
    }

//    public String toString() {
//        return this.root == null ? "." : this.root.toString();
//    }
}
