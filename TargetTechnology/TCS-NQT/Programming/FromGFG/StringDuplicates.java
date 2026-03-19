import java.util.HashSet;
import java.util.LinkedHashSet;

public class StringDuplicates {

    public static String removeDuplicateString(String s) {


        HashSet<Character> exists = new HashSet<>();
        StringBuilder ans = new StringBuilder();

        // Traverse through the string
        for (char c : s.toCharArray()) {
            
            // If character is not found in set, 
            // add it to result
            if (!exists.contains(c)) {
                ans.append(c);
                exists.add(c);
            }
        }
        
        return ans.toString();
        
    }
    


    public static void main(String[] args) {
        String str = "geEksforGEeks";


        System.out.println(removeDuplicateString(str));

    }
}
