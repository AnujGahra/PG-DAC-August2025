public class EqualSum {


    public static String equilbrium(int[] arr) {
        int n = arr.length;
        int[] pre = new int[n+1];

        for(int i = 1; i<=n; i++) {
            pre[i] = pre[i-1] + arr[i-1];
        }

        int sum = 0;
        for(int i = n - 1; i>=0; i--) {
            if(pre[i] == sum) return "True";
            sum += arr[i];
        }

        return "false";
    }
    

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3};

        System.out.println(equilbrium(arr));
    }
}
