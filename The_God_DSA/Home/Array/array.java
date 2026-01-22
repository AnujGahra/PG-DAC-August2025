public class array {
    public static void main(String[] args) {

        // int arr[] = {}; 
        // int arr[] = {10, 22, 35, 47, 59};
        int[] arr = {10, 22, 35, 47, 59};
        System.out.println("Length of the array: " + arr.length);
        // Array Itration
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println("Element at index " + i + ": " + arr[i]);
        // }


        // For Each Loop: Enhance For Loop
        System.out.println("Using For Each Loop:");
        for (int element : arr) {
            System.out.println("Element: " + element);
        }
    } 
}
