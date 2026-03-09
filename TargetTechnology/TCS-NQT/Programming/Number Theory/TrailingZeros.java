public class TrailingZeros {
    

    public static void main(String[] args) {
        int n = 125;
        int ans = 0;
        int i = 5;
        while(i <= n) {
            ans += (n/i);
            i*=5;
        }
        System.out.println(ans);
    }
}
