public class NumberOfOccurence {
    

    public static void main(String[] args) {
        System.out.println("********** Number of Occurrence **********");
        int[] arr = {1, 2, 3, 2, 4, 2, 5};
        int target = 2;
        int count = 0;
        
        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }
        
        System.out.println("Number of occurrences of " + target + ": " + count);
    }
}
