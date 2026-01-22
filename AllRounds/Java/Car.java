public class Car {
    
    String color;

    float price;

    Car() { // Default constructor
        color = "Black";
        price =  98976;
    }


    public static void main(String[] args) {
        Car swift = new Car();
        System.out.println(swift.color);
        System.out.println(swift.price);

    }





}
