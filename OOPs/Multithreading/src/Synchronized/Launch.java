package Synchronized;

public class Launch {

	public static void main(String[] args) {
		
		
		Resource resource = new Resource();
		
		User u1 = new User(resource);
		User u2 = new User(resource);
		
		u1.setName("USER - 1");
		u2.setName("USER - 2");
		
		u1.start();
		u2.start();

	}

}
