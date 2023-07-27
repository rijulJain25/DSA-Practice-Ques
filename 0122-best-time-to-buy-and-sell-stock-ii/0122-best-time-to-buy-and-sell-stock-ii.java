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
        int dp[][] = new int[prices.length+1][2];
        for(int row[]: dp){
            Arrays.fill(row, -1);
        }

        dp[prices.length][0] = 0;
        dp[prices.length][1] = 0;

        int profit;

        for(int ind = prices.length-1; ind>=0; ind--){
            for(int buy = 0; buy<=1; buy++){
                if(buy == 0){
                    profit =  Math.max(dp[ind+1][1]-prices[ind], dp[ind+1][0]);
                }else{
                    profit =  Math.max(prices[ind]+dp[ind+1][0], dp[ind+1][1]);
                }
                dp[ind][buy] = profit;
            }
        }

        return dp[0][0];
    }
}