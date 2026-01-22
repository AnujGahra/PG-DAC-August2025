public class MergeTwoArray {
    

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};

        int[] mergedArray = new int[arr1.length + arr2.length];
        int index = 0;

        for (int i = 0; i < arr1.length; i++) {
            mergedArray[index++] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            mergedArray[index++] = arr2[i];
        }

        System.out.println("Merged array:");
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }

        System.out.println();
        
        
    }
}
