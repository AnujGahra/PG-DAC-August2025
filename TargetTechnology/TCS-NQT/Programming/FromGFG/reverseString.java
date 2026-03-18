public class reverseString {
    

    public static void main(String[] args) {
        

    String str = "Anuj Kumar";

    int n = str.length();

    // String rev = "";
    // for(int i = n - 1; i >= 0; i--) {
    //     rev += str.charAt(i);
    // }

    // System.out.println(rev);

    // }

    // StringBuilder result = new StringBuilder();
    // for(int i = n-1; i>=0; i--) {
    //     result.append(str.charAt(i));
    // }

    String reversed = new StringBuilder(str).reverse().toString();

    System.out.println(reversed);
}
}
