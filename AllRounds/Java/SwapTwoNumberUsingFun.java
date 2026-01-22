public class SwapTwoNumberUsingFun {
    

    public static void swapNum(int a, int b) {
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        swapNum(a, b);

        System.out.println("In main method after swapNum call: a = " + a + ", b = " + b);
    }
}
