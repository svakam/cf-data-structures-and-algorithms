package graph;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GraphNode<T> {
    T value;
    Set<Edge<T>> neighbors;

    public GraphNode(T value) {
        this.value = value;
        this.neighbors = new HashSet<>();
    }

    public GraphNode(T value, Set<Edge<T>> neighbors) {
        this.value = value;
        this.neighbors = new HashSet<>();
    }
}
