package divide_and_conquer.partition.quick_sort;

import java.util.Arrays;

public class QuickSort_in_place {
    public static void main(String[] args) {
        new QuickSort_in_place().run();
    }

    public void run() {
        int[] arr = {1,9,7,3,4,6,5,2,8};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void quickSort(int[] arr) {
        quickSortRecurse(arr, 0, arr.length - 1);

    }

    private void quickSortRecurse(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int i = start + 1, j = start + 1, pivot = arr[start];
        while (i <= end && j <= end) {
            if (arr[j] > pivot) {
                j++;
            }
            else {
                swap(arr, i ,j);
                i++;
                j++;
            }
        }
        swap(arr, start, i - 1);

        quickSortRecurse(arr, start, i - 1);
        quickSortRecurse(arr, i, end);
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }


}
