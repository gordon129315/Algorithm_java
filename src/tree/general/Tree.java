package tree.general;

import java.util.HashMap;
import java.util.Map;

public class Tree {
    Map<String, Node> nodes = new HashMap<>();
    private Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public Node getOrCreatNode(String name) {
        Node node = nodes.get(name);
        if (node != null) {
            return node;
        }

        node = new Node(name);
        nodes.put(name, node);
        return node;
    }

}
