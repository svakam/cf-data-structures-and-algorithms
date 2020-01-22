package stackAndQueue;

import org.junit.*;
import org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

public class PseudoQueueTest {
    @Test
    public void testInstantiate() {
        PseudoQueue pseudo = new PseudoQueue();
        System.out.println("pseudo = " + pseudo);
    }

    PseudoQueue p = new PseudoQueue();

    @Test
    public void testEnqueue() {
        p.enqueue(2);
        assertEquals(2, p.stackEnqueue.peek());
        p.enqueue(3);
        assertEquals("test if enqueue stack taking in values", 3, p.stackEnqueue.peek());
    }

    @Test
    public void testDequeue() {
        p.enqueue(2);
        p.enqueue(3);
        assertEquals("test if nodes transferring from enqueue stack to dequeue stack and then dequeueing", 2, p.dequeue());
        assertEquals("test if dequeueing continues to work on same stack", 3, p.stackDequeue.peek());
        assertEquals("test full dequeue", 3, p.dequeue());
    }

    @Test
    public void testFullEnqueueDequeue() {
        p.enqueue(4);
        p.enqueue(10);
        p.enqueue(20);
        p.enqueue(40);
        assertEquals(4, p.dequeue());
        assertEquals(10, p.dequeue());
        assertEquals(20, p.dequeue());
        assertEquals(40, p.dequeue());
    }

    @Test (expected = Exception.class)
    public void testOverDequeue() {
        p.enqueue(10);
        p.enqueue(20);
        p.dequeue();
        p.dequeue();
        p.dequeue();
    }
}


