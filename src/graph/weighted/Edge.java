package graph.weighted;

public class Edge {
    Node n1;
    Node n2;
    int value;

    public Node oppssite(Node source) {
//        return n1 == source ? n2 : n1;  //有安全性问题
        if (n1 == source) {
            return n2;
        }
        if (n2 == source) {
            return n1;
        }
        return null;
    }



}
