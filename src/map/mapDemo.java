package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class mapDemo {
    public static void main(String[] args) {
        new mapDemo().run();
    }

    public void run() {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 5);
        map.put("B", 6);


        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }


    }
}
