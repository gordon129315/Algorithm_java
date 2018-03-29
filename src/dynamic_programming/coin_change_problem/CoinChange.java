package dynamic_programming.coin_change_problem;


import java.util.Arrays;

public class CoinChange {

    public static void main(String[] args) {
        new CoinChange().run();
    }

    public void run() {
        int coins[] = {2, 5, 3, 6};
        int value = 10;
        System.out.println(solve(coins, value));

    }

    public int solve(int[] coins, int value) {
        Arrays.sort(coins);
        return recursion(coins, coins.length - 1, value);
    }

    private int recursion(int[] coins, int i, int restValue) {
        if (restValue == 0) {
            return 1;
        }

        if (restValue < 0 || i < 0) {
            return 0;
        }

        //选了 + 没选，从下一个开始选
        return recursion(coins, i, restValue - coins[i]) + recursion(coins, i - 1, restValue);

    }


}
