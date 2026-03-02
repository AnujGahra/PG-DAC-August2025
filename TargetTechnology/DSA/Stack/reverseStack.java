import java.util.Stack;

public class reverseStack {
    

    public static void main(String[] args) {
        
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack);

        Stack<Integer> rt = new Stack<>();
        while(stack.size() > 0) {
            rt.push(stack.pop());
        }

        System.out.println(rt);

        Stack<Integer> qt = new Stack<>();
        while(rt.size() > 0) {
            qt.push(rt.pop());
        }
        System.out.println(qt);
        while (qt.size() > 0) {
            System.out.print(qt.pop() + " ");
        }
        System.out.println();
    }
}
