package graph;

public class Edge<T> {
    T weight;
    GraphNode<T> next;

    public Edge(T weight, GraphNode<T> next) {
        this.weight = weight;
        this.next = next;
    }
}
