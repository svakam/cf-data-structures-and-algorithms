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
}
