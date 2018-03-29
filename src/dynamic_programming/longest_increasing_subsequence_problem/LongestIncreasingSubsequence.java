/*
最长递增子序列问题
Longest Increasing Subsequence Problem

问题
给定一个未排序序列 A
你可以从左到右任意选择其中的元素ai，构建一个子序列
问构建的升序子序列最大长度是多少
 */

package dynamic_programming.longest_increasing_subsequence_problem;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        new LongestIncreasingSubsequence().run();
    }

    public void run() {
        int[] arr = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(solve(arr));
    }

    public int solve(int[] arr){
        return recursion(arr, arr.length, Integer.MAX_VALUE);
    }

    private int recursion(int[] arr, int i, int maxValue) {
        if (i == 0) {
            return 0;
        }

        int num1 = Integer.MIN_VALUE;
        if (arr[i - 1] < maxValue) {
            num1 = 1 + recursion(arr, i - 1, arr[i - 1]);
        }
        int num2 = recursion(arr, i - 1, maxValue);

        return Math.max(num1, num2);

    }
}
