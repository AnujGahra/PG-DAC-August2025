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


        // 

    }


    public static void main(String[] args) {
        HashMapMethods();
    }
}