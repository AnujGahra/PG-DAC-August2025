import java.util.LinkedHashSet;

public class RemoveDuplicates {
    

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 5, 3, 6};

        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int num : arr) {
            set.add(num);
        }

        for(int num1 : set) {
            System.out.print(num1 + " ");
        }
    }
}
