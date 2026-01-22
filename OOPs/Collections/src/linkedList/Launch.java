package linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Launch {

	public static void main(String[] args) {
		
		
		LinkedList<Object> x = new LinkedList<Object>();
		x.add("Anuj Gahra");
		x.add("Raju");
		
		
		LinkedList<Object> ll = new LinkedList<Object>();
		ll.add("raju");
		ll.add(123);
		ll.add(123);
		ll.add(null);
		ll.add(false);
		ll.add('a');
		
		System.out.println(ll);
		
		List<Object> subList = ll.subList(1,  3);
		System.out.println(subList);
		
		
		Iterator<Object> itr = ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		for(int i=0; i<ll.size(); i++) {
			System.out.println(ll.get(i));
		}
		
		for(Object o: ll) {
			System.out.println(o);
		}
		
		ll.add(2, "Gahra");
		System.out.println(ll);
		
		ll.addAll(x);
		System.out.println(ll);
		
		ll.addAll(0, x);
		System.out.println(ll);
		
		ll.remove("raju");
		System.out.println(ll);
		
		Integer k = 123;
		ll.remove(k);
		System.out.println(ll);
		
		ll.remove(0);
		System.out.println(ll);
		
		ll.removeAll(x);
		System.out.println(ll);

	}

}
