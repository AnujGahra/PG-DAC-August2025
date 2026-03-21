import java.util.HashMap;

public class MostFrequentCharacter {


    public static char getMaxOccuringChar(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();

        for(char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        char result = 'z';
        int maxFreq = -1;

        for(char ch : freq.keySet()) {
            int count = freq.get(ch);
            if(count > maxFreq || (count == maxFreq && ch < result)) {
                maxFreq = count;
                result = ch;
            }
        }

        return result;
    }
    


    public static void main(String[] args) {
        String str = "testsample";

        System.out.println(getMaxOccuringChar(str));
    }
}
