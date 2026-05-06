public class PalindromeChecker {


    public static boolean isPalindrome(String str) {
        String rev = "";
        for(int i = str.length() - 1; i>=0; i--) {
            rev += str.charAt(i);
        }
        return str.equals(rev);
    }


    public static boolean isPalindromeUsingStringBuilder(String str) {
        String rev = new StringBuilder(str).reverse().toString();
        return str.equals(rev);
    }


    public static void isPalindromeStringChecker(String str) {
        boolean isPlaindrome = true;

        for(int i = 0; i < str.length() / 2; i++) {
            if(str.charAt(i) != str.charAt(str.length() - i - 1)) {
                isPlaindrome = false;
                break;
            }
        }
        System.out.println("Is palindrome: " + isPlaindrome);
    }
    

    public static void main(String[] args) {
        String str = "madam";
        System.out.println("Is palindrome: " + isPalindrome(str));

        System.out.println("Is palindrome using StringBuilder: " + isPalindromeUsingStringBuilder(str));
        isPalindromeStringChecker(str);
    }
}
