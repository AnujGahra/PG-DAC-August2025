public class ConstructorChaining {
    

    //Write code for constructor chaining below this line
    ConstructorChaining() {
        this(10);
        System.out.println("Default Constructor");
    }
    ConstructorChaining(int a) {
        this(10, 20);
        System.out.println("Single Parameterized Constructor: " + a);
    }
    ConstructorChaining(int a, int b) {
        System.out.println("Two Parameterized Constructor: " + a + ", " + b);
    }

    


    public static void main(String[] args) {
        
        ConstructorChaining obj = new ConstructorChaining();

    }
}
