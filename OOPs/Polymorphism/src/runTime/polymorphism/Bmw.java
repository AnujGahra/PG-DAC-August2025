package runTime.polymorphism;

public class Bmw extends Car {
	
	
	@Override
	public void mileage() {
		System.out.println("BMW mileage");
	}
	
	@Override
	public void speed() {
		System.out.println("BMW speed");
	}
	
	@Override
	public void ai() {
		System.out.println("BMW ai");
	}
	
	@Override
	public void engineType() {
		System.out.println("BMW engineType");
	}
	
	@Override
	public void color() {
		System.out.println("BMW Color");
	}
}
