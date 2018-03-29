package Linear_data_structure.list.linkedList;

import java.util.Iterator;

public class LinkedListIterator implements Iterator<Integer>{
    private LinkedListNode node;

    public LinkedListIterator(LinkedListNode node) {
        this.node = node;
    }

    @Override
    public boolean hasNext() {
        return node != null;
    }

    @Override
    public Integer next() {
        int value = node.getValue();
        node = node.getNextNode();
        return value;


    }

    /*public boolean exist(){
        return node != null;
    }

    public int value(){
        return node.getName();
    }

    public void next(){
        node = node.getNextNode();
    }*/



}
