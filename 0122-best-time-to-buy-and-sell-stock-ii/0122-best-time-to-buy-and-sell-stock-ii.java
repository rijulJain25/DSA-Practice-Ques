class Solution {
    
    public static int helper(int[] price, int ind, int buy, int[][] dp){
        if(ind == price.length){
            return 0;
        }

        if(dp[ind][buy] != -1){
            return dp[ind][buy];
        }

        int profit;

        if(buy == 0){
            profit =  Math.max(helper(price, ind+1, 1, dp)-price[ind], helper(price, ind+1, 0, dp));
        }else{
            profit =  Math.max(price[ind]+helper(price, ind+1, 0, dp), helper(price, ind+1, 1, dp));
        }
        return dp[ind][buy] = profit;
    }

    public int maxProfit(int[] prices) {
        int dp[][] = new int[prices.length][2];
        for(int row[]: dp){
            Arrays.fill(row, -1);
        }

        return helper(prices, 0, 0, dp);
    }
}