package nextedtry;

public class Simple {
    public static void main(String[] args) {
        try {
            Integer data = null;          // object reference can be null
            System.out.println(data.toString()); // will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("NullPointer Error");
        } finally {
            System.out.println("Finally block is always executed");
        }
        System.out.println("Rest of the code");
    }
}
