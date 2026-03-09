public class SquareRoot {



    public static int root1(int n) {
        int result = 1;

        while(result*result <= n) {
            result ++;
        }

        return result - 1;
    }


    // Using Binary Search
    public static int root2(int n) {
        int start = 0;
        int end = n;
        int ans = 0;

        while(start <= end) {

            int mid = (start + end) / 2;

            if(mid * mid == n)
                return mid;

            if(mid * mid < n) {
                ans = mid;
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        return ans;
    }
    

    public static void main(String[] args) {
        

        int n = 40;

        

        System.out.println(root2(n));

    }
}
