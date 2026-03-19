public class Removeallcharacters {


    public static String removeSpecialCharacter(String str) {

        String res = "";

        for(int i = 0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                res += ch;
            }
        }

        if(res.length() == 0) return "-1";
        return res;
    }
    

    public static void main(String[] args) {
        String str = "$Gee*k;s..fo, r'Ge^eks?";

        String result = removeSpecialCharacter(str);
        System.out.println(result);
    }
}
