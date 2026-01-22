import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        
        int arr[] = new int[size];

        // Inserting values in the array
         for (int i = 0; i < size; i++) {
             System.out.println("Enter element " + (i + 1) + ":");
             arr[i] = sc.nextInt();
         }
        // arr[0] = 10;
        // arr[1] = 20;
        // arr[2] = 30;
        // arr[3] = 40;
        // arr[4] = 50;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
