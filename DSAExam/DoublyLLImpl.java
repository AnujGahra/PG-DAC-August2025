public class DoublyLLImpl {

    
    static class Node {
        int value;
        Node prev;
        Node next;

        Node(int data) { // constructor for initialize value when object is created
            this.value = data;
            this.prev = null;
            this.next = null;
        }
    }

    Node head = null;

    // Add element at front
    public void addAtFront(int data) {
        Node newNode = new Node(data);

        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
    }

    // Add element at end
    public void addAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        } 

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    //  Add element at specific position (1-based index)
    public void addAtPosition(int data, int position) {
        if (position <= 1) {
            addAtFront(data);
            return;
        }

        Node temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            addAtEnd(data);
            return;
        }

        Node newNode = new Node(data);
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }

    //  Delete first node
    public int deleteAtFront() {
        if (head == null) {
            System.out.println("List is empty");
            return -1;
        }

        head = head.next;
        if (head != null) {
            head.prev = null;
        }
        return 0;
    }

    // Delete last node
    public int deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return -1;
        }

        if (head.next == null) {
            head = null;
            return 0;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.prev.next = null;
        return 0;
    }

    //  Check if list is empty
    public boolean isEmpty() {
        return head == null;
    }

    //  Display list elements
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " <-> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // Main method for testing
    public static void main(String[] args) {
        DoublyLLImpl dll = new DoublyLLImpl();

        dll.addAtFront(10);
        dll.addAtFront(5);
        dll.addAtEnd(20);
        dll.addAtEnd(30);
        dll.addAtPosition(25, 3);

        dll.display();

        
        dll.deleteAtFront();
        System.out.print("LinkedList after delete an element at Front: ");
        dll.display();


        // Call the function of Delete node from last of Dll
        dll.deleteAtEnd();
        System.out.print("LinkedList after delete an element at End: ");
        dll.display();

        System.out.println("Is list empty? " + dll.isEmpty());
    }
}
