package oneclass.onethread;

public class Seven extends Thread {
	
	
	@Override
	public void run() {
		
		String name = Thread.currentThread().getName();
		System.out.println(name + "seven");
		
		
		
		for(int i=1; i<=10; i++) {
			System.out.println(7*i);
			try {
				Thread.sleep(2000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		
	}
	}

}
