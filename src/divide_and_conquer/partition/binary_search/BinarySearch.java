package divide_and_conquer.partition.binary_search;

public class BinarySearch {
    public static void main(String[] args) {
        new BinarySearch().run();
    }

    public void run() {
        int[] arr = {2, 4, 5, 8, 9};
        System.out.println(binarySearch(arr, 9));
    }

    public boolean binarySearch(int[] arr, int q) {
        return  binarySearchRecurse(arr, 0 , arr.length, q);
    }


    public boolean binarySearchRecurse(int[] arr, int i, int j, int q) {
        if (i >= j) {
            return false;
        }

        int mid = i + (j - i) / 2;
        if (arr[mid] > q) {
            return binarySearchRecurse(arr, i, mid, q);
        }
        else if (arr[mid] < q) {
            return binarySearchRecurse(arr, mid + 1, j, q);
        }
        else if (arr[mid] == q) {
            return true;
        }
        return false;
    }
}
