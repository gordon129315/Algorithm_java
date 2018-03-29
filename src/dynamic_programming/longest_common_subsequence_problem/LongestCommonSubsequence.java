/*
最长公共子序列问题
Longest Common Subsequence Problem

问题
给定两个序列 A和 B
找到这两个序列的最长子序列
 */

package dynamic_programming.longest_common_subsequence_problem;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        new LongestCommonSubsequence().run();
    }

    public void run() {
        String[] s1 = {"C", "A", "T", "A", "G", "T", "A", "C", "G"};
        String[] s2 = {"A", "G", "A", "T", "C", "G", "C", "A", "A"};
        System.out.println(solve(s1, s2));
    }

    public int solve(String[] s1, String[] s2) {
        return recursion(s1, s2, s1.length - 1, s2.length - 1);
    }

    public int recursion(String[] s1, String[] s2, int i, int j) {
        if (i < 0 || j < 0) {
            return 0;
        }

        if (s1[i] == s2[j]) {
            return 1 + recursion(s1, s2, i - 1, j - 1);
        }
        int n1 = recursion(s1, s2, i, j - 1);
        int n2 = recursion(s1, s2, i - 1, j);
        return Math.max(n1, n2);
    }

}
