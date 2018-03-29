package tree.general;

import java.util.LinkedList;
import java.util.List;

public class Node {
    List<Node> subNodes = new LinkedList<>();
    Node parent;

    private String name;

    public Node(String name) {
        this.name = name;
    }

    public void addSubNode(Node node) {
        subNodes.add(node);
        node.parent = this;
    }
}
