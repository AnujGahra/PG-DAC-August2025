public class reverseLinkedList {


    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }
    

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // display using recursive call
    public static void displayRec(Node head) {
        if (head == null) {
            System.out.println("null");
            return;
        }
        displayRec(head.next);
        System.out.print(head.val + "->");
    }


    // 
    public static Node reverse(Node head) {
        if(head.next == null) {
            return head;
        }
        Node newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
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


        display(a);
        System.out.println();
        // displayRec(a);

        Node newHead = reverse(a);
        display(newHead);
    }
}
