package tree;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

import java.util.LinkedList;

public class TreeTest {

    //              8
    //            /    \
    //          4       12
    //         /       /  \
    //        2       10   14

    Node testTree;
    // make a tree to test orders with
    @Before public void setUp() {
        testTree = new Node(8,
                new Node(4, new Node(2), null),
                new Node(12, new Node(10),
                        new Node(14)
                )
        );
    }

    Tree test = new Tree();

    ArrayList<Integer> expected = new ArrayList<>();

    // test preorder
    @Test public void testPreOrder() {
        expected.add(8);
        expected.add(4);
        expected.add(2);
        expected.add(12);
        expected.add(10);
        expected.add(14);

        String expectedArray = expected.toString();
        String actualArray = test.preOrder(testTree).toString();

        assertEquals(expectedArray, actualArray);
    }

//     test inorder
    @Test public void testInOrder() {
        expected.add(2);
        expected.add(4);
        expected.add(8);
        expected.add(10);
        expected.add(12);
        expected.add(14);

        String expectedArray = expected.toString();
        String actualArray = test.inOrder(testTree).toString();

        assertEquals(expectedArray, actualArray);
    }

    // test postorder
    @Test public void testPostOrder() {
        expected.add(2);
        expected.add(4);
        expected.add(10);
        expected.add(14);
        expected.add(12);
        expected.add(8);

        String expectedArray = expected.toString();
        String actualArray = test.postOrder(testTree).toString();

        assertEquals(expectedArray, actualArray);
    }

    // test breadthtraversal
    @Test public 
}
