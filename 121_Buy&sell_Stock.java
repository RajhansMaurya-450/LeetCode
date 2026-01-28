public class 121_Buy&sell_Stock {
    class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;
        for(int i=0; i<prices.length;i++) {
            if(buyPrice < prices[i]){ //profit
                int profit = prices[i] - buyPrice; //today's profit
                maxProfit = Math.max(maxProfit,profit);
            }
            else{
                buyPrice = prices[i]; //loss
            }
        }
        return maxProfit;
    }
}
}
