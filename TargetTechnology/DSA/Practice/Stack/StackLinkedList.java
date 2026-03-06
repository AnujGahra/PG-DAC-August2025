package Stack;

public class StackLinkedList {
    

    class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node top;

    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }


    // pop
    int pop() {
        if(top == null) {
            return -1;
        }

        int value = top.data;
        top = top.next;
        return value;
    }

        int peek(){

        if(top == null){
            return -1;
        }

        return top.data;
    }

    boolean isEmpty(){
        return top == null;
    }



    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Top element after pop: " + stack.peek());
    }

}
