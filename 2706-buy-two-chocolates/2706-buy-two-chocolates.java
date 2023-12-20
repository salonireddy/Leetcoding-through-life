class Solution {
    public int buyChoco(int[] prices, int money) {
       int small = Integer.MAX_VALUE, small2 = Integer.MAX_VALUE;
       for(int i=0;i<prices.length;i++){
           if(prices[i]<small){
               small2 = small;
               small = prices[i];
           }else{
               small2 = Math.min(prices[i],small2);
           }
       }
       int res = small+small2>money? money: money-(small+small2);
       return res;
    }

}