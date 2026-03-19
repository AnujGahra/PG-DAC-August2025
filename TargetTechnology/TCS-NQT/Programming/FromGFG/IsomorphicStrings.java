public class IsomorphicStrings {


    public static boolean areIsomorphic(String str1, String str2) {
        int n = str1.length();

        for(int i = 0; i<n; i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);

            for(int j = 0; j<n; j++) {

                if(str1.charAt(j) == c1 && str2.charAt(j) != c2) return false;

                if(str2.charAt(j) == c2 && str1.charAt(j) != c1) return false;
            }
        }

        return true;
    }
    

    public static void main(String[] args) {
        String str1 = "abc", str2 = "xyz";

        System.out.println(areIsomorphic(str1, str2));
    }
}
