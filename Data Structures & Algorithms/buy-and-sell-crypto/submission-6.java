class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int buy = 0;
        int sell = 1;
        while (buy < sell && sell < prices.length){
            int profit = prices[sell] - prices[buy];
            if (profit >= 0){
                ans = Math.max(profit, ans);
                sell++;
            } 
            else if (profit < 0){
                buy = sell;
                sell = buy + 1;
            }
        }
        return ans;
    }
}
