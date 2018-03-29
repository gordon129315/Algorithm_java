/*
选硬币问题
Coin-Row Problem

问题:
给定一堆硬币，排成一行，第 i个硬币 价值 vi
选硬币求和最大值，但是，选中的硬币 不能相邻
 */

package dynamic_programming.coin_row_problem;

import java.util.HashMap;

public class CoinRow {
    public static void main(String[] args) {
        new CoinRow().run();
    }

    public void run() {
        int[] arr = {20, 10, 20, 50, 20, 10, 20};
        System.out.println(maxValue(arr));
    }

    public int maxValue(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();  //remember the repeat data
        return maxValueRecurse(arr, arr.length, map);
    }

    private int maxValueRecurse(int[] arr, int i, HashMap<Integer, Integer> map) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return arr[0];
        }

        if (map.containsKey(i)) {
            return map.get(i);
        }

        int v1 = arr[i - 1] + maxValueRecurse(arr, i - 2, map);
        int v2 = maxValueRecurse(arr, i - 1, map);

        int max = Math.max(v1, v2);
        map.put(i, max);

        return max;
    }
}
