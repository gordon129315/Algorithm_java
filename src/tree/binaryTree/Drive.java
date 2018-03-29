package tree.binaryTree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Drive {
    public static void main(String[] args) throws FileNotFoundException {
        new Drive().run();
    }

    public void run() throws FileNotFoundException {
        int[][] data ={{2, 0, 4},{1, 2, 3},{3, 5, 6},{4, 7, 0}};
//        Tree tree = Tree.build(data);

        Scanner scanner = new Scanner(new File("src/tree/data/tree/t2.txt"));
        Tree tree = new Tree();
        while (scanner.hasNext()) {
            String parentName = scanner.next();
            String leftName = scanner.next();
            String rightName = scanner.next();

            Node parent = tree.getOrCreatNode(parentName);

            if (tree.getRoot() == null) {
                tree.setRoot(parent);
            }

            if (!leftName.equals("0")) {
                Node left = tree.getOrCreatNode(leftName);
                parent.setLeft(left, true);
            }
            if (!rightName.equals("0")) {
                Node right = tree.getOrCreatNode(rightName);
                parent.setRight(right, true);
            }

        }
        System.out.println();

//        tree.preOrderTraverse();
//        tree.preOrderTraverse2();
        List<Node> nodes = tree.preOrderList();
        for (Node node : nodes) {
            System.out.println(node.getName());
        }

    }
}
