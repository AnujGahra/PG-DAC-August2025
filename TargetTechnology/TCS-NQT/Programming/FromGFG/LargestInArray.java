import java.util.Arrays;

public class LargestInArray {

    public static void largestMethod1(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);


        System.out.println("Largest Element in the Array: "+arr[n-2] + " " + arr[n-1] + " " + arr[1]);
    }


    // 2nd method
    public static void largestMethod2(int[] arr) {
        int n = arr.length;
        int largest = Integer.MIN_VALUE;

        for(int i = 0; i<n; i++) {
            if(arr[i] > largest) largest = arr[i];
        }
        System.out.println("Largest number of array is: " + largest);
    }


    // mean of the array
    public static void meanOfArray(int[] arr) {
        float sum = 0;
        for(int i = 0; i<arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("mean of array is: " + sum/arr.length);
    }


    


    public static void main(String[] args) {
        int[] arr = {1, 8, 7, 56, 90};

        largestMethod1(arr);
        System.out.println();
        largestMethod2(arr);
        System.out.println();
        meanOfArray(arr);


    }
}
