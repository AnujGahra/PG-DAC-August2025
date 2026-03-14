public class returnNonRepeatingElement {


    public static String removeVowel(String str) {
        StringBuilder result = new StringBuilder();
    }
    


    public static void main(String[] args) {
        String str1 = "art";
        String str2 = "work";

        int n = Math.max(str1.length(), str2.length());

        StringBuilder concat = new StringBuilder();

        for(int i = 0; i<n; i++) {
            // Alternate concatenation
            if(i < str1.length()) {
                concat.append(str1.charAt(i));
            }

            if(i < str2.length()) {
                concat.append(str2.charAt(i));
            }
        }

        String merged = concat.toString();
        System.out.println("Alternate Concat: " + merged);

        String noVowel = removeVowel(merged);

        
    }
}
