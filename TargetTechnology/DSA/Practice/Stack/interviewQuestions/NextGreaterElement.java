package interviewQuestions;

public class NextGreaterElement {

    public static void main(String[] args) {

        int arr[] = { 4, 5, 2, 10, 8 };
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = -1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    res[i] = arr[j];
                    break;
                }
            }
        }

        for (int n : arr) {
            System.out.print(n + " ");
        }

        System.out.println();

        for (int i : res) {
            System.out.print(i + " ");
        }

    }
}
