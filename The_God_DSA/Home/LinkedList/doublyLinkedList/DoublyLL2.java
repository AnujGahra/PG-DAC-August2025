package doublyLinkedList;


public class DoublyLL2 {

    // Node class
    public static class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
        }
    }

    // Create Doubly Linked List from array
    public static Node createFromArray(int[] arr) {
        if (arr.length == 0) return null;

        Node head = new Node(arr[0]);
        Node curr = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            curr.next = temp;
            temp.prev = curr;
            curr = temp;
        }
        return head;
    }

    // Print from head to tail
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Print from tail to head
    public static void printReverse(Node head) {
        if (head == null) return;

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    // Print list starting from any random node
    public static void printRandom(Node random) {
        if (random == null) return;

        // Move to head
        while (random.prev != null) {
            random = random.prev;
        }

        // Print forward
        while (random != null) {
            System.out.print(random.val + " ");
            random = random.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {4, 10, 2, 99, 13};

        Node head = createFromArray(arr);

        // Print forward
        printList(head);

        // Print backward
        printReverse(head);

        // Print from random node
        printRandom(head.next.next); // starting from value 2
    }
}

