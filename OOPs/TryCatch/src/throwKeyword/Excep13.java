package throwKeyword;

public class Excep13 {
	
	static void validate(int age) {
		if(age<19) 
			throw new ArithmeticException("not valid");
			else 
				System.out.println("Welcome to vote");
		
	}
	

	public static void main(String[] args) {
		
		validate(13);
		System.out.println("Rest of the code");
		

	}

}
