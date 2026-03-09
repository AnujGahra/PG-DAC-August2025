public class SquareRoot {
    

    public static void main(String[] args) {
        

        int n = 40;

        int result = 1;

        while(result*result <= n) {
            result++;
        }

        System.out.println(result - 1);
    }
}
