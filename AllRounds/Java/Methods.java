public class Methods {
    
    static void display() {
        System.out.println("This is a display method");
    }

    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("This is Methods class");

        display();
        Methods obj = new Methods();
        int sum = obj.add(5, 10);
        System.out.println("Sum: " + sum);


    }
}
