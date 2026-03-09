public class QueueImplUsingLinkedList {


    public static class Node{
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static  class queueLL{
        Node head = null;
        Node tail = null;
        int size = 0;

        // method for add element
        public void add(int x) {
            Node temp = new Node(x);

            if(size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }

            size++;

        }

        // remove element method
    }

    public static void main(String[] args) {

    }
}
