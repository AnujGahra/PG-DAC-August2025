package Stack;

public class StackArray {

    int arr[];
    int top;
    int capacity;

    StackArray(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    void push(int x) {
        if(top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = x;
    }

    int pop() {
        if(top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    int peek() {
        if(top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top];
    }

    boolean isEmpty() {
        return top == -1;
    }

    int size() {
        return top + 1;
    }

    void display() {
        if(top == -1) {
            System.out.println("Stack is empty");
            return;
        }

        for(int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        StackArray st = new StackArray(5);

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        st.display();

        System.out.println("Top element: " + st.peek());

        System.out.println("Popped: " + st.pop());

        st.display();

        System.out.println("Size: " + st.size());
    }
}