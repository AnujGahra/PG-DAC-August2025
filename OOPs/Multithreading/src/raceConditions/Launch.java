package raceConditions;

public class Launch {

	public static void main(String[] args) throws InterruptedException {
		
		Account account = new Account();
		
		Card card1 = new Card(account);
		Card card2 = new Card(account);
		
		 card1.setName("CARD-1");
		 card2.setName("CARD-2");
		
		card1.start();
		card2.start();
		
		card1.join();
		card2.join();
		
		account.get();

	}

}
