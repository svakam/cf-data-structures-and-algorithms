package tree;

import org.junit.Test;
import static org.junit.Assert.*;

public class NodeTest {
    // test instantiation
    @Test public void testInstantiate() {
        Node node = new Node(2);
        System.out.println("node instantiated, success = " + node);
    }

    // test get value
    @Test public void testGetValue() {
        Node node = new Node(3);
        assertEquals(3, node.getValue());
    }
}
