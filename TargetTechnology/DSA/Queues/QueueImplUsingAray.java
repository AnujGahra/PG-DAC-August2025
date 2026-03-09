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
    }

    public static void main(String[] args) {

    }
}
