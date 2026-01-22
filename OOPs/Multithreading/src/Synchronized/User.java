package Synchronized;

public class User extends Thread {
	
	private Resource resource;
	
	public User(Resource resource) {
//		super();
		this.resource = resource;
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		resource.printer(name);
	}
}
