class Solution {
    public int maxProfit(int[] prices) {
        int minprice=Integer.MAX_VALUE;
       int totalprice=0;
       for(int i=1;i<prices.length;i++){
        if(prices[i]>prices[i-1]){
            totalprice+=prices[i]-prices[i-1];
        }
       }
       return totalprice;
    }
}