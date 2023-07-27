class Solution {
    public int maxProfit(int[] prices) {
         int prof = 0;
        int LstProf = Integer.MAX_VALUE;
        int max = 0;
        for(int i =0; i<prices.length; i++){
            if(prices[i]<LstProf){
                LstProf = prices[i];
            }
            prof = prices[i]-LstProf;
            if(prof > max){
                max = prof;
            }
        }
        return max;
    }
}