package divide_and_conquer.divide_and_conquer.merge_sort;


public class MergeSort {
    public static void main(String[] args) {
        new MergeSort().run();
    }

    public void run() {
        int[] arr = {1,9,7,3,4,6,5,2,8};
//        int[] arr = {1, 9, 8, 7, 1};
        mergeSort(arr);
        show(arr);
    }

    public void mergeSort(int[] arr) {
        int[] newArr = mergeSortRecurse(arr);
        System.arraycopy(newArr, 0, arr, 0, arr.length);
//        show(newArr);
    }

    private int[] mergeSortRecurse(int[] arr) {
        if (arr.length == 0 || arr.length == 1) {
            return arr;
        }

        int halfLength = arr.length / 2;
        int[] leftArr = new int[halfLength];
        int[] rightArr = new int[arr.length - halfLength];
        System.arraycopy(arr, 0, leftArr, 0, halfLength);
        System.arraycopy(arr, halfLength, rightArr, 0, arr.length - halfLength);
        leftArr = mergeSortRecurse(leftArr);
        rightArr = mergeSortRecurse(rightArr);

        int[] newArr = new int[leftArr.length + rightArr.length];
        int i = 0, j = 0, k = 0;
        while (i < leftArr.length && j < rightArr.length) {
            newArr[k++] = leftArr[i] < rightArr[j] ? leftArr[i++] : rightArr[j++];  //ascending order
//            newArr[k++] = leftArr[i] > rightArr[j] ? leftArr[i++] : rightArr[j++];  //descending order
        }
        if (i < leftArr.length) {
            restOut(newArr, k, leftArr, i);
        }
        else if (j < rightArr.length) {
            restOut(newArr, k, rightArr, j);
        }

        return newArr;
    }

    private void restOut(int[] newArr, int k, int[] arr, int i) {
        for (int x = i; x < arr.length; x++) {
            newArr[k++] = arr[x];
        }
    }

    public void show(int[] arr) {
        for (int v : arr) {
            System.out.print(v + " ");
        }
        System.out.println();
    }

}
