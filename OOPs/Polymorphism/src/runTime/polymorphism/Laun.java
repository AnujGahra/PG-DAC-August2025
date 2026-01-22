package runTime.polymorphism;

public class Laun {

	public static void main(String[] args) {
		
		
		
		Garage garage = new Garage(); 
		
		Thar thar = new Thar();  // Upcasting
		garage.permit(thar);
		
		Bmw bmw = new Bmw();
		garage.permit(bmw);
		 
		Alto alto = new Alto();
		garage.permit(alto);
		
		Nano nano = new Nano();
		garage.permit(nano);
		
	}

}
