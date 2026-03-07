package interviewQuestions;

import java.util.Stack;

public class NextGreaterElementUsingStack {

    public static int[] nextGreater(int[] arr) {

        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }

            if (st.isEmpty())
                res[i] = -1;
            else
                res[i] = st.peek();

            st.push(arr[i]);
        }

        return res;
    }

    public static void main(String[] args) {

        int[] arr = { 4, 5, 2, 25 };

        int[] res = nextGreater(arr);

        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}