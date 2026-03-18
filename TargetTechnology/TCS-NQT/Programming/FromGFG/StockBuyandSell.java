public class StockBuyandSell {


    public static int maxProfit(int[] prices) {
        

        int ans = 0;
        int min_element = prices[0];

        for(int i = 0; i<prices.length; i++) {
            min_element = Math.min(min_element, prices[i]);

            int profit = prices[i] - min_element;
            ans = Math.max(ans, profit);
        }


        return ans;
    }
    


    public static void main(String[] args) {
        int[] arr = {7, 10, 1, 3, 6, 9, 2};
    }
}
