class Solution {
    public int maxProfit(int[] prices) {
        int diff = 0;
        int min=prices[0]+1;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min = prices[i];
            }
            if(prices[i]-min > diff)
                diff= prices[i]-min;
        }
        return diff;
    }
}