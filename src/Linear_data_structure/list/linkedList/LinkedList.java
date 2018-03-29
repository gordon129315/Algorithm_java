package Linear_data_structure.list.linkedList;

public class LinkedList implements Iterable<Integer>{


    private LinkedListNode headNode;



    public LinkedListNode getHeadNode() {
        return headNode;
    }

    @Override
//    public Iterator<Integer> iterator() {
    public LinkedListIterator iterator() {
        return new LinkedListIterator(headNode);
    }
//    public LinkedListIterator iterator(){
//        return new LinkedListIterator(headNode);
//    }

    public void buildDemo(){
        LinkedListNode n1 = new LinkedListNode(6);
        headNode = n1;

        LinkedListNode n2 = new LinkedListNode(7);
        n1.setNextNode(n2);

        LinkedListNode n3 = new LinkedListNode(3);
        n2.setNextNode(n3);

        LinkedListNode n4 = new LinkedListNode(8);
        n3.setNextNode(n4);

        LinkedListNode n5 = new LinkedListNode(4);
        n4.setNextNode(n5);
    }

    public String description(){
        if (isEmpty()) {
            return "[]";
        }

        String text = "[";

        LinkedListNode node = headNode;

        text += node.getValue();
        node = node.getNextNode();
        while (node != null){
            text += ", ";
            text += node.getValue();
            node = node.getNextNode();
        }

        text += "]";

        return text;
    }

    public int size() {
        int count = 0;
        LinkedListNode node = headNode;
        while (node != null) {
            count += 1;
            node = node.getNextNode();
        }
        return count;
    }

    public boolean isEmpty(){
        return headNode == null;
    }



    public int get(int index) {
        if (index < 0) {
            return -1;
        }

        LinkedListNode node = getNode(index);

        if (node == null) {
            return -1;
        }

        return node.getValue();
    }

    public int lastValue() {
        if (isEmpty()) {
            return -1;
        }

        return getLastNode().getValue();
    }

    public int indexOf(int value) {
        int index = 0;
        LinkedListNode node = headNode;
        while (node != null) {
            if (node.getValue() == value) {
                return index;
            }
            index++;
            node = node.getNextNode();
        }

        return -1;
    }

    public boolean contains(int value) {
        return indexOf(value) != -1;
    }



    public void add(int value) {
        if (isEmpty()) {
            headNode = new LinkedListNode(value);
        } else {
            LinkedListNode node = new LinkedListNode(value);
            getLastNode().setNextNode(node);
        }
    }

    public void push(int value) {
        add(value);
    }

    public int pop(){
        if (isEmpty()) {
            return -1;

        } else if (hasOnlyOneNode()) {
            int value = headNode.getValue();
            headNode = null;
            return value;

        } else {
            LinkedListNode secondLastNode = getSecondLastNode();
            LinkedListNode lastNode = secondLastNode.getNextNode();
            secondLastNode.setNextNode(null);
            return lastNode.getValue();
        }
    }



    public int remove(int index){
        if (index < 0) {
            return -1;
        }

        if (isEmpty()) {
            return -1;
        }

        if (index == 0) {
            LinkedListNode node = headNode;
            headNode = headNode.getNextNode();
            return node.getValue();

        } else {
            LinkedListNode previousNode = getNode(index - 1);
            LinkedListNode node = previousNode.getNextNode();
            if (node == null) {
                return -1;
            }
            previousNode.setNextNode(node.getNextNode());
            return node.getValue();
        }
    }

    public void insert(int index, int value) {
        if (index < 0) {
            return;
        }

        if (index == 0) {
            LinkedListNode node = new LinkedListNode(value);
            node.setNextNode(headNode);
            headNode = node;
        } else {
            LinkedListNode previousNode = getNode(index - 1);
            if (previousNode == null) {
                return;
            }
            LinkedListNode node = new LinkedListNode(value);
            node.setNextNode(previousNode.getNextNode());
            previousNode.setNextNode(node);
        }
    }

    public void replace(int index, int value) {
        if (index < 0) {
            return;
        }

        LinkedListNode node = getNode(index);
        if (node == null) {
            return;
        }

        node.setValue(value);
    }

    /*
     *  Inner - Methods
     */

    private boolean hasOnlyOneNode() {
        if (headNode == null) {
            return false;
        }

        return headNode.getNextNode() == null;
    }

    private LinkedListNode getNode(int index) {
        LinkedListNode node = headNode;
        for (int i = 0; i < index; i++) {
            node = node.getNextNode();
            if (node == null) {
                break;
            }
        }
        return node;
    }

    // headNode should not be empty
    private LinkedListNode getLastNode(){

        LinkedListNode node = headNode;
        LinkedListNode nextNode = node.getNextNode();

        while (nextNode != null) {
            node = nextNode;
            nextNode = node.getNextNode();
        }

        return node;
    }

    private LinkedListNode getSecondLastNode(){

        LinkedListNode node = headNode;
        LinkedListNode nextNode = node.getNextNode();

        while (nextNode.getNextNode() != null) {
            node = nextNode;
            nextNode = node.getNextNode();
        }

        return node;
    }

}































