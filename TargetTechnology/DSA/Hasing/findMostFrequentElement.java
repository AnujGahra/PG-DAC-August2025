import java.util.HashMap;
import java.util.Map;

public class findMostFrequentElement {


    

    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 2, 4, 2, 5, 2};

        Map<Integer, Integer> freq = new HashMap<>();

        for(int el : arr) {
            if(!freq.containsKey(el)) {
                freq.put(el, 1);
            } else {
                freq.put(el, freq.get(el) + 1);
            }
        }

        System.out.println("Frequuency Map");
        System.out.println(freq.entrySet());

        
    }
}
