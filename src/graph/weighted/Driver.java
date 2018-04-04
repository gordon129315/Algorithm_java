package graph.weighted;


import java.util.LinkedList;

public class Driver {
    public static void main(String[] args) throws Exception {
        new Driver().run();
    }

    public void run() throws Exception {
        Node a = new Node("A");
        Node b = new Node("B");

//        Edge edge = new Edge();
//        edge.n1 = a;
//        edge.n2 = b;
//        a.edges.add(edge);
//        b.edges.add(edge);
        Edge edge = a.connect(b, true);
        edge.value = 10;

        LinkedList<Edge> edges = b.edges;
        for (Edge edge1: edges) {
            Node opposite = edge1.oppssite(b);
        }

    }
}
