class Solution {
    
    // public static int helper(int[] price, int ind, int buy, int[][] dp){
    //     if(ind == price.length){
    //         return 0;
    //     }

    //     if(dp[ind][buy] != -1){
    //         return dp[ind][buy];
    //     }

    //     int profit;

    //     if(buy == 0){
    //         profit =  Math.max(helper(price, ind+1, 1, dp)-price[ind], helper(price, ind+1, 0, dp));
    //     }else{
    //         profit =  Math.max(price[ind]+helper(price, ind+1, 0, dp), helper(price, ind+1, 1, dp));
    //     }
    //     return dp[ind][buy] = profit;
    // }

    public int maxProfit(int[] prices) {
        int prev[] = new int[2];
        int curr[] = new int[2];

        prev[0] = 0;
        prev[1] = 0;

        int profit = 0;

        for(int ind = prices.length-1; ind>=0; ind--){
            for(int buy = 0; buy<=1; buy++){
                if(buy == 0){
                    profit =  Math.max(prev[1]-prices[ind], prev[0]);
                }else{
                    profit =  Math.max(prices[ind]+prev[0], prev[1]);
                }
                curr[buy] = profit;
            }
            prev = curr;
        }

        return curr[0];
    }
}