import java.util.*;

class PrimeThread extends Thread {
    public void run() {
        Random r = new Random();
        int num = r.nextInt(899) + 101;
        int sum = 0;
        System.out.println("Generated number for PrimeThread: " + num);
        for (int i = 2; i <= num; i++) {
            if (isPrime(i))
                sum += i;
        }
        System.out.println("Sum of primes up to " + num + ": " + sum);
    }

    private boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}

class SquareThread extends Thread {
    public void run() {
        Random r = new Random();
        int num = r.nextInt(89) + 11;
        System.out.println("Generated number for SquareThread:" + num);
        System.out.println("Squares from 1 to " + num + ":");
        for (int i = 1; i <= num; i++) {
            System.out.print(i + "^2=" + (i * i) + " ");
        }
        System.out.println();
    }
}

class MultiplesOfFiveThread extends Thread {
    public void run() {
        Random r = new Random();
        System.out.println("Generated 100 numbers for MultiplesOfFiveThread:");
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < 100; i++) {
            int n = r.nextInt(500) + 1;
            list.add(n);
        }

        System.out.println(list);
        System.out.println("Numbers that are multiples of 5:");
        for (int n : list) {
            if (n % 5 == 0)
                System.out.print(n + " ");
        }
        System.out.println();
    }
}

public class MultiThreadTasks {
    public static void main(String[] args) {
        new PrimeThread().start();
        new SquareThread().start();
        new MultiplesOfFiveThread().start();

    }
}
