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
            else if(rear == arr.length - 1) {
                rear = 0;
                arr[0] = val;
            }
        }


        public int remove() throws Exception {
            if(size == 0) {
                throw new Exception("Queue is Empty");
            } else {
                int val = arr[front];
                if(front == arr.length - 1) front = 0;
                else front ++;

                return val;
            }
        }


        

    }

    public static void main(String[] args) {

    }
}
