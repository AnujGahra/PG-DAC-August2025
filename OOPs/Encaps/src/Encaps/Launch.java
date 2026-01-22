package Encaps;

public class Launch {

	public static void main(String[] args) {
		Demo demo = new Demo();
		
		int res = demo.access();
		System.out.println(res);
		
		
		int newbal = 5000;
		demo.mutator(newbal);
		
		res = demo.access();
		System.out.println(res);

	}

}
