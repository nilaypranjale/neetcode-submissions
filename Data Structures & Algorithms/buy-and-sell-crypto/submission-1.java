class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;
        int lowestPrice=100;
        int indexOfLowest = 0;
        for(int i = 0 ; i < prices.length; i++)
        {
            if(prices[i]<lowestPrice)
            {
                lowestPrice = prices[i];
                indexOfLowest = i;
            }

            int profit = prices[i]-lowestPrice;
            if(profit>result)
                result = profit;
        }
        return result;
    }
}
