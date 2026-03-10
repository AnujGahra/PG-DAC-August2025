public class LongestRepetitionSequenceString {

    public static void main(String[] args) {
        String str = "aaabbcaaaa";

        int count = 1;
        int ans = 1;

        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i) == str.charAt(i - 1))
                count++;
            else
                count = 1;

            ans = Math.max(ans, count);
        }

        System.out.println(ans);

    }

    
}
