/*
背包问题
Knapsack Problem
问题
给定n个物品，分别重wn,价值vn
给定一个背包能容纳W重量

如何装东西，才能有最大的价值

要求：要拿一个东西，就得把它都拿走，不能拿走部分。
 */

package dynamic_programming.backpack_problem;

import java.util.HashMap;

public class Backpack {
    public static void main(String[] args) {
        new Backpack().run();
    }

    public void run() {
        int items[][] = {{23, 92}, {31, 57}, {29, 49}, {44, 68}, {53, 60}, {38, 43}, {63, 67},
                {85, 84}, {89, 87}, {82, 72}};
        int bagCapacity = 165;
        System.out.println(maxValue(items, bagCapacity));

    }

    public int maxValue(int[][] items, int bagCapacity) {
        HashMap<Combination, Integer> map = new HashMap<>();
        return maxValueRecurse(bagCapacity, items, items.length, map);
    }

    private int maxValueRecurse(int restOfWeight, int[][] items, int i, HashMap<Combination, Integer> map) {
        if (restOfWeight <= 0) {
            return 0;
        }
        if (i == 0) {
            return 0;
        }

        Combination key = new Combination(restOfWeight, i);
        if (map.containsKey(key)) {
            return map.get(key);
        }

        int v1 = restOfWeight - items[i - 1][0] >= 0 ? items[i - 1][1] + maxValueRecurse(restOfWeight - items[i - 1][0], items, i - 1, map) : 0;
        int v2 = maxValueRecurse(restOfWeight, items, i - 1, map);

        int max = Math.max(v1, v2);
        map.put(key, max);

        return max;
    }
}
