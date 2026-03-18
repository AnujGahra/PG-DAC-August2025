public class CountStringLength {


    public static int lengthString(String str) {
        int count = 0;
        char[] ch = str.toCharArray();
        for(char c : ch) {
            count++;
        }
        return count;
    }
    

    public static void main(String[] args) {
        String str = "Anuj";

        System.out.println(lengthString(str));


    }
}
