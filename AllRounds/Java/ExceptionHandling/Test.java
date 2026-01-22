class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}

public class Test {
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18)
            throw new InvalidAgeException("Not eligible");
    }

    public static void main(String[] args) {
        try {
            checkAge(19);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
