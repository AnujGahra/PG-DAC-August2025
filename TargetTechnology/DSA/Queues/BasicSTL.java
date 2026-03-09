import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BasicSTL {

    public static void main(String[] args) {
        
        // ArrayList<Integer> al = new ArrayList<>();
        // LinkedList<Integer> ll = new LinkedList<>();

        // Queue<Integer> qu = new Queue<>(); // X
           
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        System.out.println( q);
        q.remove();
        System.out.println(q);
        q.poll();
        System.out.println(q);

        System.out.println(q.element());
        System.out.println(q.peek());
        
    }
}