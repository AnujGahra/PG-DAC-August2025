public class implementation {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // LinkedList class
    static class LinkedList {
        Node head = null;
        Node tail = null;

        void insertAtEnd(int val) {
            Node temp = new Node(val);

            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }

        // Insert at the beginning of the linked list
        void insertAtBeginning(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }

        // insert at a specific position in the linked list
        void insertAtPosition(int val, int pos) {
            Node t = new Node(val);
            Node temp = head;

            if (pos == size() + 1) {
                insertAtEnd(val);
                return;
            } else if (pos == 0) {
                insertAtBeginning(val);
                return;
            } else if (pos < 0 || pos > size()) {
                System.out.println("Invalid position");
                return;
            }

            for (int i = 0; i < pos - 1; i++) {
                temp = temp.next;
            }

            t.next = temp.next;
            temp.next = t;
        }

        // LinkedList size
        int size() {
            int count = 0;
            Node temp = head;

            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

        void display() {

            Node temp = head;

            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }

        // getElement Method
        int getElement(int pos) {
            Node temp = head;
            for (int i = 1; i <= pos; i++) {
                temp = temp.next;
            }

            return temp.data;
        }

        // Delete at index method
        void deleteAtIndex(int idx) {
            Node temp = head;

            if (idx == 0) {
                head = head.next;
                return;
            }
            for (int i = 1; i < idx; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            tail = temp;

        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);

        list.insertAtBeginning(6);
        list.insertAtBeginning(3);

        list.insertAtPosition(15, 4);

        list.display();
        System.out.println("Size of the linked list: " + list.size());

        System.out.println("Element at position 3: " + list.getElement(3));
    }
}