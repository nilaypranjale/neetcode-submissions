class Solution {
    public int maxProfit(int[] prices) {
        //brute:
        if(prices.length<=1)
            return 0;
        int maxprofit = 0;
        int l = 0, r = 1;
        while(l<=r && r < prices.length)
        {
            int profit = prices[r]-prices[l];
            maxprofit=Math.max(profit,maxprofit);
            if(prices[r]<prices[l])
            {
                l=r;
                r++;
            }
            else
                r++;
        }
        return maxprofit;
    }
}
