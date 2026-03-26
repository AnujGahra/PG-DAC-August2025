public class SumOfNumbersInString {
    public static void main(String[] args) {
        String str = "An2ujKu23mar4";

        int sum = 0;
        int num = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                // build the number
                num = num * 10 + (ch - '0');
            } else {
                // add number to sum when non-digit appears
                sum += num;
                num = 0;
            }
        }

        // add last number if string ends with digit
        sum += num;

        System.out.println("Sum = " + sum);
    }
}