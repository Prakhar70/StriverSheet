package Day_1_Array;

public class StockBuySell {
    public int maxProfit(int[] prices) {
        
        int cost_price = prices[0];
        int n = prices.length;
        int max_profit = 0;
        for (int i=1;i<n;i++){
            
            int profit = prices[i]-cost_price;
            max_profit = Math.max(max_profit, profit);
            cost_price =Math.min (cost_price, prices[i]);
            
        }
        return max_profit;
    }
}
