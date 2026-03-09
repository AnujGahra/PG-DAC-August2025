public class QueueImplUsingAray {

    public static class queueArray {

        int front = -1; // queue mein front se element nikala jata h
        int rear = -1; // queue mein rear se element dala jata h
        int size = 0;

        int[] arr = new int[100];

        public void add(int val) {
            if (rear == arr.length - 1) {
                System.out.println("Queue is full");
                return;
            }

            if (front == -1)
                front = rear = 0;
            else
                arr[++rear] = val;
        }

        // method for remove
        public int remove() {

            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }

            front++;
            size--;
            return arr[front - 1];
        }

        // method for top element
        public int peek() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }

        public boolean isEmpty() {
            if (size == 0)
                return true;
            else
                return false;
        }

        // display queue
        public void display() {
            if (size == 0) {
                System.out.println("Queue is empty");
            } else {
                for (int i = front; i <= rear; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

    }
}
