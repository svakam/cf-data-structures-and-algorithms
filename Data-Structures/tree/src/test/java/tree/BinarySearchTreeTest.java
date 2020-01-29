package tree;

import org.junit.Test;
import static org.junit.Assert.*;

public class BinarySearchTreeTest {
    BinarySearchTree tree;
    Tree traverse;

    @Test public void testAdd() {
        tree = new BinarySearchTree();
        traverse = new Tree();
        tree.add(1);
        traverse.preOrder(tree.root);
    }

    @Test public void testContainsTrue() {
        tree = new BinarySearchTree();
        traverse = new Tree();
        tree.add(2);
        tree.add(3);
        tree.add(4);
        traverse.preOrder(tree.root);
        assertTrue(tree.contains(3));
    }

    @Test public void testContainsFalse() {
        tree = new BinarySearchTree();
        traverse = new Tree();
        tree.add(2);
        tree.add(3);
        tree.add(4);
        traverse.preOrder(tree.root);
        assertFalse(tree.contains(5));
    }
}
