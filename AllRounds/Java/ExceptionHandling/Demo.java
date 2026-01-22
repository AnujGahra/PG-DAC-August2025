public class Demo {
    public static void main(String[] args) {
        // try {
        // int a = 10 / 0;
        // } catch (ArithmeticException e) {
        // System.out.println("Cannot divide by zero");
        // }

        // try {
        // int a = 10 / 0;
        // } catch (ArithmeticException e) {
        // System.out.println("Arithmetic Exception");
        // } catch (Exception e) {
        // System.out.println("General Exception");
        // }

        // nested try-catch
        try {
            try {
                int a = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Inner catch");
            }
        } catch (Exception e) {
            System.out.println("Outer catch");
        }

    }
}
