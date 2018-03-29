package Linear_data_structure.list.linkedList;

import java.util.Iterator;

public class LinkedListDemo {

    public static void main(String[] args) {
        new LinkedListDemo().run();
    }

    public void run(){
        LinkedList list = new LinkedList();
        list.buildDemo();

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
