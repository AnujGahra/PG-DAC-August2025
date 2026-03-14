import java.util.*;

public class Main {

    static boolean vowel(char c){
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public static void main(String[] args) {

        String s1 = "art";
        String s2 = "work";

        String a="", b="", merged="";

        for(char c: s1.toCharArray())
            if(!vowel(c)) a += c;

        for(char c: s2.toCharArray())
            if(!vowel(c)) b += c;

        int n = Math.max(a.length(), b.length());

        for(int i=0;i<n;i++){
            if(i<a.length()) merged += a.charAt(i);
            if(i<b.length()) merged += b.charAt(i);
        }

        HashSet<Character> set = new HashSet<>();

        for(char c: merged.toCharArray()){
            if(set.contains(c)){
                System.out.println(c);
                break;
            }
            set.add(c); 
        }
    }
}