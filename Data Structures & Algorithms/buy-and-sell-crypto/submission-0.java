class Solution {
    public int maxProfit(int[] prices) {
        int low = 0, maxProfit = 0;
        low = prices[0];
        
        for( int sell : prices)
        {
            maxProfit = Math.max(maxProfit , sell - low);
            low = Math.min(low, sell);
        }

        return maxProfit;
    }
}
