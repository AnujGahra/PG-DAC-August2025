import java.util.Arrays;

public class ArraySubset {


    public static boolean isSubset(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0, j = 0;
        while(i < arr1.length && j < arr2.length) {
            if(arr1[i] == arr2[j]){
                i++;
                j++;
            }else {
                i++;
            }
        }

        if(j == arr2.length) return true;
        return false;
    }
    

    public static void main(String[] args) {
        int[] arr1 = {11, 7, 1, 13, 21, 3, 7, 3};
        int[] arr2 = {11, 3, 7, 1, 7};

        System.out.println(isSubset(arr1, arr2));

    }
}
