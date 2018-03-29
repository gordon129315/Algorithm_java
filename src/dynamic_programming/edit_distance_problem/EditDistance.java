/*
编辑距离问题
Edit Distance Problem

给定两个序列A和B
你可以编辑 一个序列 使它 变为 另外一个序列
你可以 添加一个元素，删除一个元素，或者修改一个元素，这些都视为一次操作
问，变为另外一个序列需要的最少操作数量是多少
 */

package dynamic_programming.edit_distance_problem;

public class EditDistance {
    public static void main(String[] args) {
        new EditDistance().run();
    }

    public void run() {
        String[] s1 = {"C", "A", "K", "E"};
        String[] s2 = {"B", "O", "O", "K"};
        System.out.println(solve(s1, s2));
    }

    public int solve(String[] s1, String[] s2) {

        return recursion(s1, s2, s1.length, s2.length);
    }

    private int recursion(String[] s1, String[] s2, int i, int j) {
        if (i == 0) {
            return j;
        }
        if (j == 0) {
            return i;
        }

        if (s1[i - 1] == s2[j - 1]) {
            return recursion(s1, s2, i - 1, j - 1);
        }

        int n1 = 1 + recursion(s1, s2, i, j - 1);
        int n2 = 1 + recursion(s1, s2, i - 1, j);
        int n3 = 1 + recursion(s1, s2, i - 1, j - 1);

        return min(n1, n2, n3);

    }

    private int min(int n1, int n2, int n3) {
        int min = Math.min(n1, n2);
        min = Math.min(min, n3);
        return min;
    }
}
