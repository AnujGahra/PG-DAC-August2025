public class LinkedListImlp {

    // Node class to represent each node in the linked list
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    static class LinkedList {
        Node head = null;
        Node tail = null;

        // Method for insert at the start of the linked list
        void insertAtStart(int data) {
            Node newNode = new Node(data);
            // newNode.next = head;
            // head = newNode;

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
        }

        // Method to display the linked list
        void Display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;

            }
            System.out.println("null");
        }

        // insert at the end of the linked list
        void insertionAtEnd(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {

                tail.next = newNode;
                tail = newNode;
            }
        }

        // insert at the given position of the linked list
        void insertionAtPosition(int data, int position) {
            Node newNode = new Node(data);
            Node temp = head;

            if (position == 0) {
                // newNode.next = head;
                // head = newNode;
                insertAtStart(data);
                return;
            } else if (position == size()) {
                insertionAtEnd(data);
            } 
             else if (position < 0 || position > size()) {
                System.out.println("Invalid position");
                return;
            }

            for (int i = 1; i < position - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
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

        // get element at the given position of the linked list
        int getElement(int pos) {
            if(head == null) {
                return -1;
            }
            Node temp = head;
            for(int i = 1; i< pos-1; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        // Search for an element in the linked list
        boolean search(int key) {
            Node temp = head;
            if(head == null) {
                return false;
            }
            while(temp != null) {
                if(temp.data == key) {
                    return true;
                }
                temp = temp.next;
            }
            return false;
        }

        // Delete at the start of the linked list
        void deleteAtStart() {
            if(head == null) {
                return;
            }

            head = head.next;
        }


        // delete at the end of the linked list
        void deleteAtEnd() {
            if(head == null && head.next == null) {
                head = null;
                return;
            }
            Node temp = head;
            while(temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }

        // delete at the given position of the linked list
        void deleteAtPosition(int position) {
            if(position == 0) {
                head = head.next;
                // deleteAtStart();
                return;
            }
            Node temp = head;

            for(int i = 1; i < position - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            tail = temp;
        }
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.insertAtStart(10);
        list.insertionAtEnd(50);
        list.insertAtStart(20);
        list.insertAtStart(30);
        list.insertAtStart(40);

        list.insertionAtPosition(25, 5);

        list.Display();

        list.deleteAtStart();
        list.deleteAtEnd();

        list.deleteAtPosition(3);
        if(list.search(25)) {
            System.out.println("Element found in the linked list");
        } else {
            System.out.println("Element not found in the linked list");
        }

        int result = list.getElement(2);


        System.out.println("Element found: " + result);

        list.Display();

        
    }

}
