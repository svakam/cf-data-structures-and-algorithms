package graph;

import java.util.List;

public class GraphNode<T> {
    T value;
    List<Edge<T>> neighbors;

    public GraphNode(T value) {
        this.value = value;
        this.neighbors = null;
    }

    public GraphNode(T value, List<Edge<T>> neighbors) {
        this.value = value;
        this.neighbors = neighbors;
    }
}
