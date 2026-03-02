import java.util.Scanner;
import java.util.Stack;

public class CopyStack {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Stack<Integer> stack = new Stack<>();
        int n;
        System.out.println("Enter the number of elements in the stack: ");
        n = sc.nextInt();
        System.out.println("Enter the elements in the stack: ");
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            stack.push(x);
        }
        System.out.println(stack);


        // revserse Order
        Stack<Integer> rt = new Stack<>();

        while(stack.size() > 0) {
            int x = stack.peek();
            rt.push(x);
            stack.pop();
        }
        System.out.println(rt);

    }
}
