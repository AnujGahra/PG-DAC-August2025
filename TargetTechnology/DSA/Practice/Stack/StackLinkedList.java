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


    // print all elements in stack
    void display() {
        if(top == null) {
            System.out.println("Stack is empty");
            return;
        }
        Node temp = top;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }



    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.display();

        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Top element after pop: " + stack.peek());

    }

}
