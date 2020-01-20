package stackAndQueue;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StackTest {
    // test instantiation of stack
    @Test public void testInstantiation() {
        Stack newStack = new Stack();
        System.out.println(newStack);
    }

    Stack stack = new Stack();
    // test push with empty and filled stack
    @Test public void testPushWithEmptyStack() {
        stack.push(2);
    }
    @Test public void testPushWithFilledStack() {
        stack.push(2);
        stack.push(3);
    }

    // test pop with empty and filled stack
    @Test (expected = Exception.class)
    public void testPopEmptyStack() {
        int value = stack.pop();
        System.out.println("value = " + value);
    }
    @Test public void testPopFilledStack() {
        stack.push(2);
        int value = stack.pop();
        System.out.println("value = " + value);
        stack.push(2);
        stack.push(3);
        value = stack.pop();
        System.out.println("value = " + value);
        stack.pop();
    }


    // test peek on empty vs filled stack
    @Test (expected = Exception.class) public void testPeekEmptyStack() {
        stack.peek();
    }
    @Test public void testPeekFilledStack() {
        stack.push(3);
        stack.push(100);
        int topValue = stack.peek();
        System.out.println("topValue = " + topValue);
    }

    // test isempty on empty vs filled stack
    @Test public void testIsEmptyOnEmptyStack() {
        assertTrue(stack.isEmpty());
    }
    @Test public void testIsEmptyOnFilledStack() {
        stack.push(3);
        assertFalse(stack.isEmpty());
    }
}
