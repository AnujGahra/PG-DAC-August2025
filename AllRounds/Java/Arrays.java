import java.util.Scanner;

public class Arrays {


    // Sum and Average of array elements
    public static int sumArray(int[] arr) {
        int sum = 0;
        for(int num: arr) {
            sum += num;
        }
        return sum;
    }
    

    public static double averageArray(int[] arr) {
        int sum = sumArray(arr);
        return (double) sum / arr.length;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("************ Arrays in Java ************");
        // int[] numbers = {1, 2, 3, 4, 5};
        // int[] numbers = new int[5];
        // numbers[0] = 10;
        // numbers[1] = 20;
        // numbers[2] = 30;
        // numbers[3] = 40;
        // numbers[4] = 50;

        // int[] numbers = new int[] {5, 10, 15, 20, 25};

        // take array as input from user
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        

        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println("\nSum of array elements: " + sumArray(numbers));
        System.out.println("Average of array elements: " + averageArray(numbers));
    }
}
