//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/

public class BestTimeToBuyAndSellStockII {
    public static void main(String[] args) {
        
    }

    static int maxProfit(int[] prices) {
        if(prices.length == 1) return 0;

        int profit = 0;
        int price = prices[0];

        for(int i = 0 ; i < prices.length ; i++){
            if(prices[i] < price){
                price = prices[i];
            }else if(prices[i] > price){
                profit += prices[i] - price;
                price = prices[i];
            }
        }
        return profit;
    }
}
