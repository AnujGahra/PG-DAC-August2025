package runnable.Interface;

public class Launch {

	public static void main(String[] args) {
		
		Runnable five = new Five();
		Runnable five1 = new Five();
		
		Runnable seven = new Seven();
		
		Thread t1 = new Thread(five);
		Thread t1f = new Thread(five1);
		Thread t2 = new Thread(seven);
		
		t1.start();
		t1f.start();
		t2.start();

	}

}
