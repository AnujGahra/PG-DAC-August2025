class TargetSum{


    static int pairSum(int [] arr, int target) {
        int n = arr.length;

        int ans = 0;
        for(int i = 0; i<n; i++) { // first element
            for(int j = i+1; j<n; j++) { // second element
                if(arr[i] + arr[j] == target) {
                    // System.out.println("Pair found: (" + arr[i] + ", " + arr[j] + ")");
                    ans++;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int [] arr = {4, 6, 3, 5, 8, 2};
        int target = 7;

        int result = pairSum(arr, target);
        System.out.println("Number of pairs with sum " + target + ": " + result);
    }
}