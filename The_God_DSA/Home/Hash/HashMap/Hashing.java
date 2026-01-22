package HashMap;

import java.util.*;

public class Hashing {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);

        System.out.println("HashMap: " + map);

        // Accessing values
        int appleCount = map.get("Apple");
        System.out.println("Apple Count: " + appleCount);

        // Iterating through the HashMap
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Checking if a key exists
        if (map.containsKey("Banana")) {
            System.out.println("Banana is present in the map.");
        }

        // Removing a key-value pair
        map.remove("Orange");
        System.out.println("After removing Orange: " + map);

        
    }
    
}
