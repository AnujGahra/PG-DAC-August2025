package chaining;

public class Data {
	
	public Data() {
		this(10);
		System.out.println("c1");
	}
	
	public Data(int a) {
		this(10.7f);
		System.out.println("c2");
	}
	
	public Data(int a, int b) {
		System.out.println("c3");
	}
	
	public Data(float a) {
		this(10, 20);
		System.out.println("c4");
	}

}
