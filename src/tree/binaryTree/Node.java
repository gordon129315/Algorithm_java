package tree.binaryTree;

public class Node {
    private String name;
    private Node left;
    private Node right;
    private Node parent;

    public Node() {
    }

    public Node(String value) {
        this.name = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node node, boolean reverse) {
        this.left = node;
        if (reverse) {
            node.setParent(this);
        }
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node node, boolean reverse) {
        this.right = node;
        if (reverse) {
            node.setParent(this);
        }
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node node) {
        this.parent = node;
    }

    public boolean isLeaf() {
        return this.getLeft() == null && this.getRight() == null;
    }

    public boolean isBranch() {
        return this.getParent() != null && (this.getLeft() != null || this.getRight() != null);
    }

    public boolean isRoot() {
        return this.getParent() == null;
    }

    public boolean isLeftNode() {
        return this.getParent().getLeft() == this;
    }

    public boolean isRightNode() {
        return this.getParent().getRight() == this;
    }

    public void preOrderVisit() {
        System.out.println(name);
        if (left != null) {
            left.preOrderVisit();
        }
        if (right != null) {
            right.preOrderVisit();
        }


    }
}
