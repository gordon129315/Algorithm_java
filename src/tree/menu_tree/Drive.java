package tree.menu_tree;

public class Drive {
    public static void main(String[] args) {
        new Drive().run();
    }

    public void run() {
        Tree tree = new Tree();

        //Level 0
        Node root = new Node("Menu");
        tree.setRoot(root);

        //Level 1
        Node file = new Node("File");
        Node edit = new Node("edit");
        Node view = new Node("view");
        root.addChild(new Node[]{file, edit, view});

        //Level 2
        Node new_window = new Node("New Window");
        Node new_file = new Node("New File");
        Node open_recent = new Node("Open Recent");
        Node save = new Node("Save");
        Node save_as = new Node("Save As");
        file.addChild(new Node[]{new_window, new_file, open_recent, save, save_as});

        Node add_node = new Node("Add Node");
        Node delete_node = new Node("Delete Node");
        edit.addChild(new Node[]{add_node, delete_node});

        Node view_symbol = new Node("View Symbol");
        Node view_class = new Node("View Class");
        Node panels = new Node("Panels");
        view.addChild(new Node[]{view_symbol, view_class, panels});

        //Level 3
        Node _201709 = new Node("201709");
        Node _201711 = new Node("201711");
        open_recent.addChild(new Node[]{_201709, _201711});

        Node pdf = new Node("PDF");
        Node image = new Node("Image");
        save_as.addChild(new Node[]{pdf, image});

        Node color = new Node("Color");
        Node picture = new Node("Picture");
        panels.addChild(new Node[]{color, picture});

        tree.preOrderTraverse();
    }
}
