public class MaxConsecutiveBit {


    public static int maxConsecBits(int[] arr) {
        int ans = 1; 
        int count = 1;
        for(int i = 1; i<arr.length; i++) {
            if(arr[i] == arr[i-1]) count ++;
            else count = 1;
            ans = Math.max(ans, count);
        }
        return ans;
    }
    


    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 1, 1, 1};

        System.out.println(maxConsecBits(arr));


    }
}
