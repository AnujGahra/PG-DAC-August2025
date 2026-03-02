import java.util.Stack;

public class DisplayStack {

    public static void displayReverseRec(Stack<Integer> s) {
        if (s.size() == 0) {
            return;
        }
        int top = s.pop();
        System.out.print(top + " ");
        displayReverseRec(s);

    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        displayRec(stack);
        // System.out.println(stack);

        // Stack<Integer> temp = new Stack<>();
        // while(stack.size() > 0) {
        // temp.push(stack.pop());
        // }

        // while (temp.size() > 0) {
        // int x = temp.pop();
        // System.out.print(x + " ");
        // stack.push(x);

        // }

        // int n = stack.size();
        // int[] arr = new int[n];

        // for(int i = n-1; i>=0; i--) {
        // arr[i] = stack.pop();
        // }
        // for(int i=0; i<n; i++) {
        // System.out.print(arr[i] + " ");
        // stack.push(arr[i]);
        // }
    }
}
