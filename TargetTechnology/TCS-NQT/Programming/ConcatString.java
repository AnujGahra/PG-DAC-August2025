public class ConcatString {

    public static void main(String[] args) {
        String s1 = "Anuj";
        String s2 = "Kumar";
        String s4 = new String("Anuj");
        // String s3 = s1.concat(s2);
        String s3 = s1 + " " + s2;

        System.out.println(s1 == s2);

        System.out.println(s3);
        System.out.println(s1.equals(s4));
        String result = String.join( s1, s2);
        System.out.println(result);
    }
}
