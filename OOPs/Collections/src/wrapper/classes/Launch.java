package wrapper.classes;

public class Launch {

	public static void main(String[] args) {
		
		int a = 10;
//		Integer i = new Integer(a); // Deprecated -> manual boxing
//		System.out.println(i);
//		
//		int k = i.intValue(); // Manual Unboxing
//		System.out.println(k);
		
//		New Method after java 5
		Integer i = a; // Auto boxing
		int k =i; // auto unboxing
		System.out.println(i);

	}

}
