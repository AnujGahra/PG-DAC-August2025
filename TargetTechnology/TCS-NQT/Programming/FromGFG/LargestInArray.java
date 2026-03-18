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


    // reverse of an array
    public static void reverse(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while(i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }


    // reverse an array using method 2
    public static int[] reverseArray(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];

        for(int i = 0; i<n; i++) {
            res[i] = arr[n-1-i];
        }
        return res;
    }


    


    public static void main(String[] args) {
        int[] arr = {1, 8, 7, 56, 90};

        largestMethod1(arr);
        System.out.println();
        largestMethod2(arr);
        System.out.println();
        meanOfArray(arr);
        System.out.println();
        // reverse(arr);
        // System.out.println(Arrays.toString(arr));

        // int[] n1 = reverseArray(arr);
        // for(int i = 0; i<n1.length; i++) {
        //     System.out.print(n1[i] + " ");
        // }

        for(int i = arr.length - 1; i>=0; i--) {
            System.out.print(arr[i] + " ");
        }


    }
}
