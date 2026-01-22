public class primeNumber {
    

    public static void main(String[] args) {
    //     int num = 29;
    //     boolean isPrime = true;

    //     for (int i = 2; i <= num/2; i++) {
    //         if (num % i == 0) {
    //             isPrime = false;
    //             break;
    //         }
    //     }

    //     if (isPrime) {
    //         System.out.println(num + " is a prime number.");
    //     } else {
    //         System.out.println(num + " is not a prime number.");
    //     }

        int n = 50;
        System.out.println("Prime numbers from 1 to " + n + " are: ");
        printPrimes(n);
    }


    // Print 1 to n prime numbers
    public static void printPrimes(int n) {
        for (int num = 2; num <= n; num++) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
