package Linear_data_structure.list.linkedList;

public class LinkedListNode {
    
    /*
     *  Basic - Constructors
     */

    public LinkedListNode() {

    }

    public LinkedListNode(int value) {
        this.value = value;
    }

    /*
     *  Basic - Properties
     */ 

    private int value;
    private LinkedListNode nextNode;

    /*
     *  Basic - Getters & Setters
     */

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public LinkedListNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(LinkedListNode nextNode) {
        this.nextNode = nextNode;
    }

    /*
     *  Compare - Methods
     */

    public boolean equalsTo(LinkedListNode node) {
        if (node == null) {
            return false;
        }

        if (node == this) {
            return true;
        }

        return this.value == node.value;
    }

    /*
     *  Copy - Constructors
     */

    public LinkedListNode(LinkedListNode node) {
        this.value = node.value;
    }

    /*
     *  Copy - Methods
     */

    public LinkedListNode copy(){
        return new LinkedListNode(value);
    }
}
