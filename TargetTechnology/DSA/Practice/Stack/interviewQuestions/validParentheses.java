package interviewQuestions;


import java.util.Stack;


public class validParentheses {

    public static boolean isValid(String str) {
        Stack<Character> st = new Stack<>();

        int n = str.length();

        for(int i = 0; i < n; i++) {
            char ch = str.charAt(i);

            if(ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } 
            else {
                if(st.size() == 0) return false;

                if(ch == ')' && st.peek() == '(') st.pop();
                else if(ch == '}' && st.peek() == '{') st.pop();
                else if(ch == ']' && st.peek() == '[') st.pop();
                else return false;
            }
        }

        return st.size() == 0;
    }

    public static void main(String[] args) {

        String s = "{[()]}";

        if(isValid(s))
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }
}