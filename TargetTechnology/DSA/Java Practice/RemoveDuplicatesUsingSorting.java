import java.util.Arrays;

public class RemoveDuplicatesUsingSorting {
    

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4,5};

        Arrays.sort(arr);

        for(int i = 0; i<arr.length-1; i++) {
            if(arr[i] != arr[i+1]){
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println(arr[arr.length-1]);
        
    }
}
