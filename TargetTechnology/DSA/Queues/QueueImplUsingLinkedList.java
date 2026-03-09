public class QueueImplUsingLinkedList {

    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static class queueLL {
        Node head = null;
        Node tail = null;
        int size = 0;

        // method for add element
        public void add(int x) {
            Node temp = new Node(x);

            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }

            size++;

        }

        // remove element method

        public int remove() {
            if (size == 0) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            return x;
        }

        // peek element
        public int peek() {
            if (size == 0) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return head.val;
        }


        // display
        public void display() {

            if(size == 0) {
                System.out.println("Queue is empty");
                return;
            }
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }


        // isEmpty
        public boolean isEmpty() {
            if(size == 0) return true;
            else return false;
        }

    }

    public static void main(String[] args) {
        queueLL qll = new queueLL();
        qll.add(1);
        qll.add(2);
        qll.add(3);
        qll.add(4);
        qll.add(5);
        qll.display();

        qll.remove();
        qll.display();

    }
}
