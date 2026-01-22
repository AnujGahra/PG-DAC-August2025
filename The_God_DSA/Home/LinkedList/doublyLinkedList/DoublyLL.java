package doublyLinkedList;

public class DoublyLL {
    public static class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
        }
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void printRevList2(Node tail) {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }


    public static void printRandom(Node random) {
        Node temp = random;
        // Move this temp backwards to the head
        while(temp.prev != null) {
            temp = temp.prev;
        }

        // now temp is at head
        // Print the list from head to tail
        while(temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println(); 
        
    }


    // Insertion at head in DDL
    public static Node insertAtHead(Node head, int x) {
        Node t = new Node(20);
        t.next = head;
        head.prev = t;
        head = t;
        return head;
    }


    // Insertion at tail in DDL
    public static void insertAtTail(Node head, int x) {
        Node temp = head;

        // temp ko tail tak leke jaate hai
        while(temp.next != null) {
            temp = temp.next;
        }

        Node t = new Node(x);
        temp.next = t;
        t.prev = temp;
        
    }


    // Insert at index in DDL
    public static void insertAtIdx(Node head, int idx, int x) {
        Node s = head;
        for(int i=1; i<-idx-1; i++) {
            s = s.next;
        }

        // s is at idx-1 position
        Node r = s.next;
        Node t = new Node(x);

        // s t r
        s.next = t;
        t.prev = s;
        t.next = r;
        r.prev = t;
    }

    public static void main(String[] args) {
        // 4 10 2 99 13

        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(99);
        Node e = new Node(13);

        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;

        e.next = null;

        // printList(a);

        // printRevList2(e);


        // Random
        // printRandom(e);

        // Node newHead = insertAtHead(a, 35);
        // printList(newHead);


        printList(a);

        insertAtTail(a, 50);
        printList(a);

        insertAtIdx(a, 3, 056);
        printList(a);

    }
}
