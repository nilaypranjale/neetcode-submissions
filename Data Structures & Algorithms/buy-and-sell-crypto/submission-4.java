class Solution {
    public int maxProfit(int[] prices) {
        //brute:
        if(prices.length<=1)
            return 0;
        int maxprofit = 0;
        for(int i=0; i < prices.length; i++)
        {
            for(int j = i+1; j < prices.length; j++)
            {
                int profit = prices[j]-prices[i];
                maxprofit= Math.max(profit, maxprofit);
            }
        }
        if(maxprofit<0) return 0;
        else return maxprofit;
    }
}
