package divide_and_conquer.partition.quick_select;

import java.util.LinkedList;
import java.util.List;

public class QuickSelect {
    public static void main(String[] args) {
        new QuickSelect().run();
    }

    public void run() {
        int[] arr = {5,2,3,4,1,6,7,8,9};
        System.out.println(getAtRank(arr, 2));
        for (int v : arr) {
            System.out.print(v);
        }

    }

    //找出数列中第i个大的数，i从0开始数
    //例如“1,2,3,4”， 第0个大的数是1,第2个大的数是3
    public int getAtRank(int[] arr, int rank) {
        int pivot = arr[0];
        List<Integer> leftList = new LinkedList<>();
        List<Integer> rightList = new LinkedList<>();

        for (int j = 1; j < arr.length; j++) {
            if (arr[j] < pivot) {
                leftList.add(arr[j]);
            }
            else if (arr[j] >= pivot) {
                rightList.add(arr[j]);
            }
        }

        if (leftList.size() == rank) {
            return pivot;
        }
        else if (leftList.size() > rank) {
            int[] newArr = ListToArray(leftList);
            return getAtRank(newArr, rank);
        }
        else if (leftList.size() < rank) {
            int[] newArr = ListToArray(rightList);
            return getAtRank(newArr, rank - leftList.size() - 1);
        }

        return 0;
    }

    private int[] ListToArray(List<Integer> list) {
        int[] arr = new int[list.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }


}
