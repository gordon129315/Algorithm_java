package graph.unWeighted;

import java.io.File;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) throws Exception{
        new Driver().run();
    }

    public void run() throws Exception{
//        Node a = new Node("A");
//        Node b = new Node("B");
//        a.nodes.add(b);
//        a.addNode(b, true);

//        Graph graph = new Graph();
//        Node a = graph.getOrCreateNode("A");
//        Node b = graph.getOrCreateNode("B");
//        a.addNode(b, true);


        Scanner scanner = new Scanner(new File("src/graph/data/g1.txt"));

        Graph graph = new Graph();
        while (scanner.hasNext()) {
            String name1 = scanner.next();
            String name2 = scanner.next();
            Node node1 = graph.getOrCreateNode(name1);
            Node node2 = graph.getOrCreateNode(name2);
            node1.addNode(node2, true);
        }

        System.out.println("");

        graph.bfs("1");
        System.out.println();
        graph.dfs("1");


    }
}
