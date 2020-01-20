package stackAndQueue;

import org.junit.Test;

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
}
