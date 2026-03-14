public class removeVowel {

    public static String removeVowel(String str) {

        StringBuilder st = new StringBuilder();

        for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'
            || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
                continue;
            }

            st.append(ch);
        }

        return st.toString();
    }

    public static void main(String[] args) {

        String str = "Anuj";

        System.out.println(removeVowel(str));
    }
}