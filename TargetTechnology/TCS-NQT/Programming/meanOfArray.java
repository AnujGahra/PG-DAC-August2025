import java.util.Scanner;

public class meanOfArray {


    public static double meanArray(int[] arr, int n) {
        int sum = 0;
        for(int i=0; i<n; i++) {
            sum += arr[i];
        }
        double mean = (double)sum/n;
        return mean;
    }
    

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the size of the array:");
            int size = sc.nextInt();
            int[] arr = new int[size];
            System.out.print("Enter the elements of the array:");
            for(int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
    
            System.out.println("Mean of the array is: " + meanArray(arr, size));
    }
}
