import java.util.HashMap;
import java.util.Map;

public class CountingFrequency {

    public static Map<String, Integer> countFrequency(String[] arr) {
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String item : arr) {
            frequencyMap.put(item, frequencyMap.getOrDefault(item, 0) + 1);
        }

        return frequencyMap;
    }

    public static void main(String[] args) {
        String[] fruits = { "Apple", "Banana", "Apple", "Orange", "Banana",
                "Orange", "Orange", "Apple", "Orange", "Grape" };

        Map<String, Integer> frequency = countFrequency(fruits);

        System.out.println("Frequency of elements:");
        for (Map.Entry<String, Integer> entry : frequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
