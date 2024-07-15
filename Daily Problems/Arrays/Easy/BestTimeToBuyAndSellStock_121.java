//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

public class BestTimeToBuyAndSellStock_121 {
    public static void main(String[] args) {
        
    }

    static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE , currMax = Integer.MIN_VALUE;

        int max = Integer.MIN_VALUE;

        for(int price : prices){
            if(price < min){
                min = price;
                currMax = Integer.MIN_VALUE;
            }else if(price > max){
                currMax = price;
                
                if(currMax-min > max){
                    max = currMax-min;
                }
            }
            
        }
        return (max == Integer.MIN_VALUE) ? 0 : max ;
    }
}
