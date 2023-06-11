class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int LstPrice = Integer.MAX_VALUE;
        int maxPro = 0;
        for(int i= 0 ; i<prices.length; i++){
            if(prices[i]<LstPrice){
                LstPrice = prices[i];
            }
            profit = prices[i]-LstPrice;
            if(profit>maxPro){
                maxPro = profit;
            }
        }
        return maxPro;
    }
}