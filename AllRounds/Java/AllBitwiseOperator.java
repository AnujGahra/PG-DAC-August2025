public class AllBitwiseOperator {
    

    public static void main(String[] args) {

        System.out.println("********** All Bitwise Operators **********");
        int a = 5;  // 0101 in binary
        int b = 3;  // 0011 in binary
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a & b = " + (a & b)); // AND
        System.out.println("a | b = " + (a | b)); // OR
        System.out.println("a ^ b = " + (a ^ b)); // XOR
        System.out.println("~a = " + (~a));       // NOT
        System.out.println("a << 1 = " + (a << 1)); //
        System.out.println("a >> 1 = " + (a >> 1)); //
        System.out.println("a >>> 1 = " + (a >>> 1)); //
        
    }
}
