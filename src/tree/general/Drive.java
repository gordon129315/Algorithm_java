package tree.general;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Drive {
    public static void main(String[] args) throws FileNotFoundException {
        new Drive().run();
    }

    public void run() throws FileNotFoundException {
//        Node n6 = new Node("6");
//        Node n7 = new Node("7");
//        n6.addSubNode(n7);
//
//        Node n3 = new Node("3");
//        n6.addSubNode(n3);


        Tree tree = new Tree();
        Scanner scanner = new Scanner(new File("src/tree/data/tree/t1.txt"));
        while (scanner.hasNext()) {
            String parent = scanner.next();
            String child = scanner.next();
            System.out.println(parent + "->" + child);

            Node parentNode = tree.getOrCreatNode(parent);
            Node childNode = tree.getOrCreatNode(child);
            parentNode.addSubNode(childNode);

            if (tree.getRoot() == null) {
                tree.setRoot(parentNode);
            }
        }
        System.out.println();

    }
}
