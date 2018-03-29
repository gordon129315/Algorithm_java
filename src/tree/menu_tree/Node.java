package tree.menu_tree;

import java.util.LinkedList;

public class Node {
    private String name;
    private Node parent;
    private LinkedList<Node> childNodes;


    public Node(String name) {
        this.name = name;
        this.childNodes = new LinkedList<>();
    }

    public String getName() {
        return name;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node node) {
        this.parent = node;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LinkedList<Node> getChildNodes() {
        return childNodes;
    }

    public void setChildNodes(LinkedList<Node> childNodes) {
        this.childNodes = childNodes;
    }

    public void addChild(Node node) {
        childNodes.add(node);
        node.parent = this;
    }

    public void addChild(Node[] nodes) {
        for (Node node : nodes) {
            childNodes.add(node);
            node.parent = this;
        }
    }
}
