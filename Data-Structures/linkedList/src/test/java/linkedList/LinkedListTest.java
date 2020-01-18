package linkedList;

import org.junit.Test;
import static org.junit.Assert.*;

public class LinkedListTest {
    // test if LL instantiates
    @Test public void instantiateList() {
        new LinkedList();
    }

    LinkedList list = new LinkedList();
    // test for values added to the list
    @Test public void testInsert() {
        list.insert(2);
        list.insert(3);
        list.insert(1);
    }

    // test for includes method returning true on an already added value
    @Test public void testIncludes() {
        list.insert(4);
        list.insert(2);
        boolean expected = list.includes(2);
        assertTrue(expected);
        boolean expected2 = list.includes(4);
        assertTrue(expected2);
        boolean expected3 = list.includes(5);
        assertFalse(expected3);
    }

    // test if values of LL print using toString method
    @Test public void testToString() {
        list.insert(1);
        list.insert(2);
        list.insert(99);
        String actualString = list.toString();
        System.out.println("actualString = " + actualString);
    }

    // test insertion at end of list
    @Test public void testAppend() {
        list.insert(5);
        list.insert(2);
        list.insert(1);
        list.append(3);
        String expected = list.toString();
        System.out.println("expected = " + expected);
    }

    // test insertion before specified node
    @Test public void testInsertBefore() {
        list.append(1);
        list.append(2);
        list.append(3);
        list.insertBefore(3,5);
        String expected = list.toString();
        System.out.println("expected = " + expected);
    }

    // test insertion after specified node
    @Test public void testInsertAfter() {
        list.append(1);
        list.append(2);
        list.append(3);
        list.insertAfter(3,5);
        String expected = list.toString();
        System.out.println("expected = " + expected);
    }

    // test kth from end happy path
    @Test public void testkthFromEndHappy() {
        list.append(1);
        list.append(5);
        list.append(3);
        System.out.println("Happy path: " + list.kthFromEnd(2));
    }

    // test kth from end with list of length 1
    @Test public void testkthFromEnd1() {
        list.append(2);
        System.out.println("Length of 1: " + list.kthFromEnd(1));
    }

    @Test public void testkthFromEndEqual() {
        list.append(5);
        list.append(10);
        System.out.println("k = length: " + list.kthFromEnd(2));
    }

    @Test public void testkthFromEndGreater() {
        list.append(99);
        list.append(102);
        list.append(1);
        System.out.println("k > length: " + list.kthFromEnd(5));
    }

    @Test public void testkthFromEndNegative() {
        list.append(220);
        list.append(10);
        list.append(34134);
        System.out.println("negative k: " + list.kthFromEnd(-1));
    }
}
