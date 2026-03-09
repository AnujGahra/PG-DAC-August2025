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

        public int remove() {
            if(size == 0) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            return x; 
        }

        // peek element
        public int peek() {
            if(size == 0) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return head.val;
        }


        
    }

    public static void main(String[] args) {

    }
}
