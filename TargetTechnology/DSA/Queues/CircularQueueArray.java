public class CircularQueueArray {


    public static class Cqa {
        int front = -1;
        int rear = -1;
        int size = 0;

        int[] arr = new int[8];


        public void add(int val) throws Exception {
            if(size == arr.length) {
                throw new Exception("Queue if full");
            }

            else if(size == 0) {
                front = rear = 0;
                arr[0] = val;
            }
            else if(rear < arr.length - 1) {
                arr[++rear] = val;
            }
            else if()
        }

    }

    public static void main(String[] args) {

    }
}
