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

    // initialize variables
    Node testTreeRoot;
    Tree test;
    ArrayList<Integer> expected;

    // instantiate test tree to test traversals on
    @Before public void setUp() {
        testTreeRoot = new Node(8,
                new Node(4, new Node(2), null),
                new Node(12, new Node(10),
                        new Node(14)
                )
        );

        test = new Tree();
        expected = new ArrayList<>();
    }

    // test preorder
    @Test public void testPreOrder() {
        expected.add(8);
        expected.add(4);
        expected.add(2);
        expected.add(12);
        expected.add(10);
        expected.add(14);

        String expectedArray = expected.toString();
        String actualArray = test.preOrder(testTreeRoot).toString();

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
        String actualArray = test.inOrder(testTreeRoot).toString();

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
        String actualArray = test.postOrder(testTreeRoot).toString();

        assertEquals(expectedArray, actualArray);
    }

    // test breadthtraversal
    @Test public void testBreadthFirst() {
        expected.add(8);
        expected.add(4);
        expected.add(12);
        expected.add(2);
        expected.add(10);
        expected.add(14);

        String expectedArray = expected.toString();
        String actualArray = test.breadthFirst(testTreeRoot).toString();

        assertEquals(expectedArray, actualArray);
    }

    // test max value return
    @Test public void testMaxValue() {
        int actualValue = test.findMaxValue(testTreeRoot);
        assertEquals(14, actualValue);
    }

    // test max value return on negative values
    @Test public void testMaxValueNegative() {
        testTreeRoot = new Node(-100,
                new Node(4, new Node(10000), null),
                new Node(2, new Node(-120),
                        new Node(14)
                )
        );
        int actualValue = test.findMaxValue(testTreeRoot);

        assertEquals(10000, actualValue);
    }
}
