package stackAndQueue;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {
    @Test public void testInstantiation() {
        Queue newQueue = new Queue();
        System.out.println("newQueue = " + newQueue);
    }

    Queue queue;

    @Before
    public void setUp() {
        queue = new Queue();
    }

    // test enqueue on empty vs filled queue
    @Test public void testEnqueueOnEmpty() {
        queue.enqueue(314);
        assertEquals(314, queue.peek());
    }
    @Test public void testEnqueueOnFilled() {
        queue.enqueue(200);
        assertEquals(200, queue.peek());
        queue.enqueue(201);
        assertEquals(200, queue.peek());
        queue.dequeue();
        assertEquals(201, queue.peek());
    }

    // test dequeue on empty vs filled queue
    @Test (expected = Exception.class) public void testDequeueOnEmpty() {
        int value = queue.dequeue();
    }
    @Test public void testDequeueOnFilled() {
        queue.enqueue(19);
        int value = queue.dequeue();
        assertEquals(19, value);
        queue.enqueue(20);
        queue.enqueue(25);
        value = queue.dequeue();
        assertEquals(20, value);
    }

    // test peek on empty vs filled queue
    @Test (expected = Exception.class) public void testPeekOnEmpty() {
        int value = queue.peek();

    }
    @Test public void testPeekOnFilled() {
        queue.enqueue(5);
        queue.enqueue(10);
        int value = queue.peek();
        assertEquals(5, value);
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
