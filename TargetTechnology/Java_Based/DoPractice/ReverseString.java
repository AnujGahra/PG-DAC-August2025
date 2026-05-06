public class ReverseString {

    public static void main(String[] args) {
        String orginal = "automation";

        // using StringBuilder
        String reversed = new StringBuilder(orginal).reverse().toString();
        System.out.println("Original string: " + orginal);
        System.out.println("Reversed string: " + reversed);
    }
}