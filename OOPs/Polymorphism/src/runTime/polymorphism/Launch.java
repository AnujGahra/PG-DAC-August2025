package runTime.polymorphism;

public class Launch {
	
	public static void main(String[] args) {
//		Thar thar = new Thar();
		Car car = new Thar(); //Upcasting
		car.mileage();
		car.speed();
		car.ai();
		car.engineType();
		car.color();
		
		
//		Bmw bmw = new Bmw();
		car = new Bmw();
		car.mileage();
		car.speed();
		car.ai();
		car.engineType();
		car.color();
		
//		Alto alto = new Alto();
		car = new Alto();
		car.mileage();
		car.speed();
		car.ai();
		car.engineType();
		car.color();
		
//		Nano nano = new Nano();
		car = new Nano();
		car.mileage();
		car.speed();
		car.ai();
		car.engineType();
		car.color();
	}
	
}
