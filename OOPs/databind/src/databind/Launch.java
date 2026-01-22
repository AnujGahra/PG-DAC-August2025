package databind;

public class Launch {

	public static void main(String[] args) {
		int id = 10;
		int age = 19;
		float height = 7.4f;
		char c = 'm';
		int weight = 100;
		
		
		Data data = new Data();
		data.setId(id);
		data.setAge(age);
		data.setHeight(height);
		data.setWeight(weight);
		data.setGender(c);
		
		Destination d = new Destination();
		d.xyz(data);
		

	}

}
