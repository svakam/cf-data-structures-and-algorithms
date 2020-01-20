package stackAndQueue;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class QueueTest {
    @Test public void testInstantiation() {
        Queue newQueue = new Queue();
        System.out.println("newQueue = " + newQueue);
    }

    Queue queue = new Queue();

    // test enqueue on empty vs filled queue
    @Test public void testEnqueueOnEmpty() {
        queue.enqueue(314);                     
    }
    @Test public void testEnqueueOnFilled() {
        queue.enqueue(200);
        queue.enqueue(201);
    }

    // test dequeue on empty vs filled queue
    @Test (expected = Exception.class) public void testDequeueOnEmpty() {
        int value = queue.dequeue();
        System.out.println("value = " + value);
    }
    @Test public void testDequeueOnFilled() {
        queue.enqueue(19);
        int value = queue.dequeue();
        System.out.println("value = " + value);
        queue.enqueue(20);
        queue.enqueue(25);
        value = queue.dequeue();
        System.out.println("value = " + value);
    }

    // test peek on empty vs filled queue
    @Test (expected = Exception.class) public void testPeekOnEmpty() {
        int value = queue.peek();
        System.out.println("value = " + value);
    }
    @Test public void testPeekOnFilled() {
        queue.enqueue(5);
        queue.enqueue(10);
        int value = queue.peek();
        System.out.println("value = " + value);
    }

    // test isempty empty vs not queue
    @Test public void testIsEmptyOnEmpty() {
        assertTrue(queue.isEmpty());
    }
    @Test public void testIsEmptyOnFilled() {
        queue.enqueue(4);
        assertFalse(queue.isEmpty());
    }
}
