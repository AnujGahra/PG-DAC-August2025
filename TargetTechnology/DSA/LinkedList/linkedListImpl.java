public class linkedListImpl {

    public static class Node {
        int data; // value of the node
        Node next; // address of the next node

        Node(int data) {
            this.data = data;

        }
    }

    public static void main(String[] args) {

        Node a = new Node(5);
        System.out.println(a.next);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);

        Node e = new Node(16);

        a.next = b; // a is connected to b -> 5 -> 3 9 8 16
        b.next = c; // b is connected to c -> 5 -> 3 -> 9 8 16
        c.next = d; // c is connected to d -> 5 -> 3 -> 9 -> 8 16
        d.next = e; // d is connected to e -> 5 -> 3 -> 9 -> 8 -> 16

        // Print Linked List
        System.out.println(a.data); // 5
        System.out.println(a.next.data); // 3
        System.out.println(a.next.next.data); // 9
        System.out.println(a.next.next.next.data); // 8
        System.out.println(a.next.next.next.next.data); // 16

        // Print Linked List using loop
        Node temp = a; // temp is pointing to head of the linked list
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next; // move temp to the next node
        }

        System.out.println();

        // Using For loop
        temp = a; // reset temp to head of the linked list
        for (int i = 0; i < 5; i++) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }
}