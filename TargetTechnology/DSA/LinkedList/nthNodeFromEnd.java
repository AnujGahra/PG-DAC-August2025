public class nthNodeFromEnd {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node nthNodeFromEnd(Node head, int n) {
        int size = 0;

        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        int m = size - n + 1;
        // mth node form start
        temp = head;
        for (int i = 1; i < m - 1; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public static Node nthNode2(Node head, int n) {
        Node slow = head;
        Node fast = head;

        for (int i = 1; i < n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;

    }

    // Remooving Nth Node form the end of LinkedList
    public static Node deleteNthFromEnd(Node head, int n) {
        Node slow = head;
        Node fast = head;
        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }

        if(fast == null) {
            head = head.next;
            return head;
        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;

        return head;
    }

    // Display the linked list
    public static void display(Node head) {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }






    public static void main(String[] args) {

        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        Node temp = nthNodeFromEnd(a, 3);
        System.out.println(temp.data);

        Node temp2 = nthNode2(a, 3);
        System.out.println(temp2.data);

        display(a);


        deleteNthFromEnd(a, 3);
        display(a);

    }
}
