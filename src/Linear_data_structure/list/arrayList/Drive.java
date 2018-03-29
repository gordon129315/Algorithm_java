package Linear_data_structure.list.arrayList;

public class Drive {
    public static void main(String[] args) {
        new Drive().run();
    }

    public void run() {
        int[] arr = new int[5];

        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);
        System.out.println(arrayList);
        arrayList.pop();
        arrayList.pop();
        arrayList.pop();
        arrayList.pop();
        arrayList.pop();

        System.out.println(arrayList.get(2));


    }



}
