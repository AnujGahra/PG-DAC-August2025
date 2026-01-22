public class TypeCasting {
    

    public static void main(String[] args) {
        // int myInt = 9;
        // double myDouble = 89f;
        // float myFloat = 90;

        // System.out.println();

        // Implicit Casting
        double myDouble = 9; // int to double
        System.out.println(myDouble);
        // Explicit Casting
        int myInt = (int)9.78; // double to int
        System.out.println(myInt);

        float myFloat = (float)67.89; // double to float
        System.out.println(myFloat);

        long myLong = (long)4567.89; // double to long
        System.out.println(myLong);

        byte myByte = (byte)130; // int to byte
        System.out.println(myByte);
    }
}
