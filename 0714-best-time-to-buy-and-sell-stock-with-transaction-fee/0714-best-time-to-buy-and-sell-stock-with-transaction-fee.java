class Solution {
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int[] prev = new int[2];
        int[] curr = new int[2];

        for(int i = n-1; i>= 0; i--){
            for(int buy = 0; buy<= 1; buy++){
                if(buy == 0){
                    curr[buy] = Math.max(prev[0], -prices[i] + prev[1]);
                }else{
                    curr[buy] = Math.max(prev[1], prices[i]+prev[0]-fee);
                }
            }
            prev = curr;
        }
        return curr[0];
    }
}