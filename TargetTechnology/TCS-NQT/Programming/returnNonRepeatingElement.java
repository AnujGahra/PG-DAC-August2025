public class returnNonRepeatingElement {

    public static String removeVowel(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' &&
                    ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {

                result.append(ch);
            }
        }
        return result.toString();
    }

    private static char secondNonRepeating(String str) {

        int[] freq = new int[256];

        // count frequency
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (freq[str.charAt(i)] == 1) {
                count++;

                if (count == 2) {
                    return str.charAt(i);
                }
            }
        }

        return '-'; // if not found
    }

    public static void main(String[] args) {
        String str1 = "art";
        String str2 = "work";

        int n = Math.max(str1.length(), str2.length());

        StringBuilder concat = new StringBuilder();

        for (int i = 0; i < n; i++) {
            // Alternate concatenation
            if (i < str1.length()) {
                concat.append(str1.charAt(i));
            }

            if (i < str2.length()) {
                concat.append(str2.charAt(i));
            }
        }

        String merged = concat.toString();
        System.out.println("Alternate Concat: " + merged);

        String noVowel = removeVowel(merged);
        System.out.println("After Removing Vowel: " + noVowel);

        char result = secondNonRepeating(noVowel);
        System.out.println("2nd Non-Repeating Character: " + result);

    }

}
