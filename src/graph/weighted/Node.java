package graph.weighted;

import java.util.LinkedList;

public class Node {
    String name;
    LinkedList<Edge> edges = new LinkedList<>();

    public Node(String name) {
        this.name = name;
    }

    public Edge connect(Node node, boolean reverse) {
        Edge edge = new Edge();
        edge.n1 = this;
        edge.n2 = node;
        this.edges.add(edge);
        if (reverse) {
            node.edges.add(edge);
        }
        return edge;
    }


}
