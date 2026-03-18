import java.util.ArrayList;

public class OddEvenNumber {
    


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8,9};
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();


        for(int num : arr) {
            if(num % 2 == 0) even.add(num);
            else odd.add(num);
        }

        System.out.println("Even numbers:" + even);
        System.out.println("Odd numbers:" + odd);
    }
}
