/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package graph;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import static org.junit.Assert.*;

public class GraphTest {
    @Test
    public void testInstantiate() {
        Graph<Integer> oneTwo = new Graph<>();
    }

    Graph<Integer> oneTwo;

    @Before
    public void setUp() {
        oneTwo = new Graph<>();
    }

    @Test
    public void testSizeOnEmpty() {
        assertEquals(0, oneTwo.size());
    }

    @Test
    public void testAddNodeAndSize() {
        GraphNode<Integer> one = oneTwo.addNode(1);
        GraphNode<Integer> two = oneTwo.addNode(2);
        assertEquals(2, oneTwo.size());
    }

    @Test
    public void testAddEdge() {
        GraphNode<Integer> one = oneTwo.addNode(1);
        GraphNode<Integer> two = oneTwo.addNode(2);
        oneTwo.addEdge(one, two, 2);
        ArrayList<Integer> expectedValues = new ArrayList<>();
        ArrayList<Integer> actualValues = new ArrayList<>();
        expectedValues.add(2);
        Set<Edge<Integer>> oneNeighbors = one.neighbors;
        for (Edge<Integer> oneNeighbor : oneNeighbors) {
            actualValues.add(oneNeighbor.next.value);
        }
        assertArrayEquals(expectedValues.toArray(), actualValues.toArray());
        Set<Edge<Integer>> twoNeighbors = two.neighbors;
        expectedValues.clear();
        expectedValues.add(1);
        actualValues.clear();
        for (Edge<Integer> twoNeighbor : twoNeighbors) {
            actualValues.add(twoNeighbor.next.value);
        }
        assertArrayEquals(expectedValues.toArray(), actualValues.toArray());
    }

    @Test
    public void testGetNodes() {
        GraphNode<Integer> one = oneTwo.addNode(1);
        GraphNode<Integer> two = oneTwo.addNode(2);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        assertArrayEquals(expected.toArray(), oneTwo.getNodes().toArray());
    }

    @Test
    public void testGetNeighbors() {
        GraphNode<Integer> one = oneTwo.addNode(1);
        GraphNode<Integer> two = oneTwo.addNode(2);
        oneTwo.addEdge(one, two, 2);
        int[] nodeAndWeightExpected = {2, 2};
        int[] nodeAndWeightActual = new int[2];
        Set<Edge<Integer>> expectedNeighbors = oneTwo.getNeighbors(one);
        for (Edge<Integer> neighbor : expectedNeighbors) {
            nodeAndWeightActual[0] = neighbor.next.value;
            nodeAndWeightActual[1] = neighbor.weight;
        }
        assertArrayEquals(nodeAndWeightExpected, nodeAndWeightActual);
    }
}
