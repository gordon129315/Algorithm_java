package graph.unWeighted;


import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Graph {
    Map<String, Node> nodes = new HashMap<>();

    public Node getNode(String name) {
        return nodes.get(name);
    }

    public Node getOrCreateNode(String name) {
        Node node = nodes.get(name);
        if (node == null) {
            node = new Node(name);
            nodes.put(name, node);
        }
        return node;
    }

    //广度遍历，从from开始bfs连通组件
    // 可用来寻找最短路径（只生效在无重量图）
    //如果发现一个相邻点的状态是waiting，说明有环
    public void bfs(String from) {
        //init nodes
        Collection<Node> nodes = this.nodes.values();
        for (Node node : nodes) {
            node.mark = Node.markNotVisited;
            node.from = null;    //记录路线的指针
        }

        LinkedList<Node> waiting = new LinkedList<>();
        Node initNode = getNode(from);
        waiting.addLast(initNode);
        initNode.mark = Node.markWaiting;

        while (!waiting.isEmpty()) {
            Node node = waiting.removeFirst();
            System.out.println(node.name);
            node.mark = Node.markVisited;

            for (Node adjNode : node.nodes) {
                if (adjNode.mark == Node.markNotVisited) {
                    waiting.addLast(adjNode);
                    adjNode.mark = Node.markVisited;
                    adjNode.from = node;
                }
            }

        }

    }

}
