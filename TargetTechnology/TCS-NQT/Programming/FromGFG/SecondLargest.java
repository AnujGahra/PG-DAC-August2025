import java.util.Arrays;

public class SecondLargest {


    public static int getSecondLargest(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);

        for(int i = n-2; i>=0; i-- ) {
            if(arr[i] != arr[n-1]) return arr[i];
        }

        return -1;

    }
    

    public static void main(String[] args) {
        int[] arr = {12, 34, 23, 56, 98};

        int firstLargest = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++) {
            if(arr[i] > firstLargest) firstLargest = arr[i];
        }

        System.out.println("First Largest Element: " + firstLargest);
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++) {
            if(arr[i] > secondLargest && arr[i] != firstLargest) secondLargest = arr[i];
        }
        System.out.println("Second Largest Element: " + secondLargest);

        System.out.println();
        System.out.println(getSecondLargest(arr));
    }
}
