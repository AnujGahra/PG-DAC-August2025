package HashSet;

import java.util.HashSet;

public class Hashing {
    

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        // Adding elements to the HashSet
        set.add(10);
        set.add(20);
        set.add(30);
        // set.add(10);

        // Searching for an element
        if (set.contains(20)) {
            System.out.println("20 is found in the HashSet.");
        }
        else {
            System.out.println("20 is not found in the HashSet.");
        }

        // Removing an element
        set.remove(30);
        System.out.println("HashSet after removing 30: " + set);


        // Iterating through the HashSet
        

    }
}
