package trycatch;

public class Simple {
	public static void main(String[] args) {
		
		
		try{
//			int data = 50/0;
			int a[] = new int[5];
			 a[6] = 50;
			
//			System.out.println("Hello , This is catch block");
		}
		catch (ArrayIndexOutOfBoundsException  e) { 
		
			
			System.out.println("Task 1 is completed");
			
		} catch (ArithmeticException e) {
			System.out.println("Task2 is completed");
		} catch (Exception e) {
			System.out.println("Task3 is completed");
		}
		
		
		System.out.println("Rest of the code ");
		
	}
}
