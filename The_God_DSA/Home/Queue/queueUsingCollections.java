import java.util.*;

public class queueUsingCollections {
    


    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // enqueue
        queue.add(1);
        queue.add(2);
        queue.add(3);

        // peek
        System.out.println("Front element: " + queue.peek());

        // dequeue
        System.out.println("Removed element: " + queue.remove());
        System.out.println("Removed element: " + queue.remove());

        // peek again
        System.out.println("Front element: " + queue.peek());


        while(!queue.isEmpty()) {
            System.out.println(queue.peek());
            queue.remove();
        }
    }
}
