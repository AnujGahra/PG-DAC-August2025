package raceConditions;

public class Account extends Thread {
	
//	private int bal = 500000;
//	private String xyz = "pqr";
	private StringBuffer xyz = new StringBuffer("pqr");
	
	
//	public synchronized void deduct(int bal, String cardName) {
//		this.bal = this.bal-bal;
//		System.out.println("DEBIT SUCCESSFULLY!");
//	}
//		
	
	private int change = 0;
	
	public void change() {
		xyz = xyz.append("a");
		
		synchronized(this) {
			// synchronized block
//			critical code
			change++; // race condition
		}
	}
	
	
	
	public void get() {
//		System.out.println(bal);
		
		int count = 0;
		for(char c : xyz.toString().toCharArray()) {
			if(c=='a') {
				count++;
			}
		}
		System.out.println(count);
	}

}
