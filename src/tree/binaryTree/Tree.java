package tree.binaryTree;

import java.util.*;

public class Tree {
    private Map<String, Node> nodes = new HashMap<>();
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



    //前序遍历 递归方法
    public void preOrderTraverse() {
        preOrderVisit(root);
    }

    private void preOrderVisit(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.getName());
        preOrderVisit(node.getLeft());
        preOrderVisit(node.getRight());
    }

    //前序遍历成List
    public List<Node> preOrderList() {
        LinkedList<Node> nodes = new LinkedList<>();
        preOrderCollect(root, nodes);
        return nodes;
    }

    private void preOrderCollect(Node node, List<Node> collector) {
        if (node == null) {
            return;
        }
        collector.add(node);
        preOrderCollect(node.getLeft(), collector);
        preOrderCollect(node.getRight(), collector);
    }

    //前序遍历2 递归方法
    public void preOrderTraverse2() {
        root.preOrderVisit();
    }



}
