import java.util.HashMap;
import java.util.Map;

public class Hashing {

    static void HashMapMethods() {

        Map<String, Integer> mp = new HashMap<>();

        // Adding Elements in Hashmap
        mp.put("Akash", 21);
        mp.put("Arman", 16);
        mp.put("Lav", 22);
        mp.put("Mahi", 52);
        mp.put("Anuj", 07);


        // Getting value of a key from the hashmap
        System.out.println(mp.get("Anuj"));
        System.out.println(mp.get("Monu"));



        // Removing a pair from the Hashmap
        System.out.println(mp.remove("Arman"));


        // Checking if a key is in the HashMap
        System.out.println(mp.containsKey("Anuj"));

        // Adding a new Entry only of the new key doesn't exist already

        mp.putIfAbsent("Yashika", 30);

        // Get all keys in the HashMap
        System.out.println(mp.keySet());

        // Get all values in the HashMap
        System.out.println(mp.values());

        // Get all entries in the HashMap
        System.out.println(mp.entrySet());


        // Traversing all entries of Hashmap - multiple method
        for(String key : mp.keySet()){
            System.out.print(key + " = " + mp.get(key) + " ");
        }

        System.out.println();

        for(Map.Entry<String,  Integer> e : mp.entrySet()){
            System.out.println(e.getKey() + " = " + e.getValue());
        }


    }


    public static void main(String[] args) {
        HashMapMethods();
    }
}