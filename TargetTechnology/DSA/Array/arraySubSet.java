public class arraySubSet {

    public static boolean isSubset(int[] arr1, int[] arr2) {
        for (int num : arr2) {
            boolean found = false;
            for (int element : arr1) {
                if (num == element) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false; // If any element of arr2 is not found in arr1, return false
            }
        }
        return true; // All elements of arr2 are found in arr1
    }


    // Two pointer approach
    public static boolean isSubsetTwoPointer(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                return false; // If arr1 has a smaller element, move i, if arr2 has a smaller element, return false
            } else {
                i++;
                j++;
            }
        }
        return j == arr2.length; // If we have traversed all elements of arr2, then arr2 is a subset of arr1
    }


    
    
    public static void main(String[] args) {
        
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 3};
    
        boolean isSubset = isSubset(arr1, arr2);
        System.out.println("Is arr2 a subset of arr1? " + isSubset);
    }
}
