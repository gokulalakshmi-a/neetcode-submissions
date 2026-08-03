class Solution {
    public int maxProfit(int[] prices) {
        int minprice=prices[0];
        int maxprofit=0;
        for(int p:prices)
        {
            minprice=Math.min(minprice,p);
            int profit=p-minprice;
            maxprofit=Math.max(maxprofit,profit);
        }
        return maxprofit;
        
    }
}
