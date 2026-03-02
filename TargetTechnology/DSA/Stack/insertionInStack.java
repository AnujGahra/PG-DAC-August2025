import java.util.Stack;

public class insertionInStack {
    

    public static void main(String[] args) {
        
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack);

        int idx = 2;
        int x = 7;
        Stack<Integer> temp = new Stack<>();

        while(stack.size() > idx) {
            temp.push(stack.pop());
        }
        stack.push(x);
        while(temp.size() > 0) {
            stack.push(temp.pop());
        }
        System.out.println(stack);
    }
}
