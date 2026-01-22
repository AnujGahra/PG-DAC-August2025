package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class Launch {

	public static void main(String[] args) {
		
		
		Queue<Object> queue = new ArrayDeque<Object>();
		
		queue.add(3);
		
		queue.add(2);
		
		queue.add(4);
		
		queue.add(5);
		
		System.out.println(queue);
		
		System.out.println(queue.poll()); // for remove element
		
		System.out.println(queue.peek());
		
		
		
		

	}

}
