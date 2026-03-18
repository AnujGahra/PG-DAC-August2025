public class CheckIsPrime {
    

    public static void main(String[] args) {
        int n = 17;

        boolean isPrime = true;

        if(n <= 1) {
            isPrime = false;
        } else {
            for(int i = 2; i<Math.sqrt(n); i++) {
                if(n % 2 == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println(n + " is Prime " + isPrime);
    }
}
