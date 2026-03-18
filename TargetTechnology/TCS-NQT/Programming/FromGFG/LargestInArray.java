import java.util.Arrays;

public class LargestInArray {

    public static void largestMethod1(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);


        System.out.println("Largest Element in the Array: "+arr[n-2] + " " + arr[n-1] + " " + arr[1]);
    }


    // 


    


    public static void main(String[] args) {
        int[] arr = {1, 8, 7, 56, 90};

        largestMethod1(arr);


    }
}
