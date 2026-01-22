public class circularQueueUsingArray {

    static class Queue {
        int[] arr;
        int size;
        int rear = -1;
        int front = -1;

        Queue(int n) {
            arr = new int[n];
            size = n;
        }

        public boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        // isFull
        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        // enqueue
        public void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }

            // first element
            if (front == -1) {
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // dequeue
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int result = arr[front];

            // single element
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % size;
            }

            return result;
        }

        // peek
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove());
        q.add(6);
        System.out.println(q.remove());
        q.add(7);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
