package runnable.Interface;

public class Five implements Runnable {
	
	@Override
	public void run() {
		
		String name = Thread.currentThread().getName();
		System.out.println(name + "five");
		
		if(name.equalsIgnoreCase("Anuj")) {
			for(int i=1; i<=10; i++) {
				System.out.println(5*i);
				try {
					Thread.sleep(2000);
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
			
			}
}

}
}
