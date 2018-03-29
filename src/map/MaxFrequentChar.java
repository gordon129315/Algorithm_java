package map;

import java.util.HashMap;
import java.util.Map;

public class MaxFrequentChar {
    public static void main(String[] args) {
        new MaxFrequentChar().run();
    }

    public void run() {
        String str = "ABBDFFRFFFGFFFD";
        System.out.println(maxFrequentChar(str));
    }

    public char maxFrequentChar(String str) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            }
            else {
                map.put(c, 1);
            }
        }


        int maxValue = 0;
        for (int i : map.values()) {
            maxValue = Math.max(maxValue, i);
        }

        for (char c : map.keySet()) {
            if (maxValue == map.get(c)) {
                return c;
            }
        }

        return ' ';

    }
}
