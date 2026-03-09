public class findMissingNumber {
    

    public static void main(String[] args) {

        int[] arr = {1,2,4,5};
        int n = 5;

        int xor1 = 0;
        int xor2 = 0;

        for(int i = 1; i <= n; i++) {
            xor1 ^= i;
        }

        for(int i = 0; i < arr.length; i++) {
            xor2 ^= arr[i];
        }

        System.out.println(xor1 ^ xor2);
    }

}
