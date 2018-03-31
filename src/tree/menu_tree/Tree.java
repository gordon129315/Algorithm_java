package tree.menu_tree;


public class Tree {
    private Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public void preOrderTraverse() {
        preOrderVisit(root, "");
    }

    private void preOrderVisit(Node node, String str) {
        if (node == null) {
            return;
        }

        if (str.length() == 0) {
            System.out.println(node.getName());
        }
        else {
            System.out.println(str.substring(0, str.length() - 1) + " " + node.getName());
        }
        int i = 0;
        for (Node child : node.getChildNodes()) {
            preOrderVisit(child, str + (++i) + ".");
        }
    }

}
