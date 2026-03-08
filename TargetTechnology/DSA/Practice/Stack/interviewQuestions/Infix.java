import java.util.Stack;

public class Infix {
    

    public static void main(String[] args) {

        String str = "9-5+3*4/6";
        
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();



        for(int i 0; i<str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;

            if(ascii>=48 && ascii <=57) val.push(ascii - 48);
            else if(op.size() == 0) op.push(ch);
            else {
                if()
            } 
            
            
        }

    }

}
