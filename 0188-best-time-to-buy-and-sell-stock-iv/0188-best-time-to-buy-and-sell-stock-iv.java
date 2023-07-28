class Solution {
    public int maxProfit(int k, int[] prices) {
        
        int[][][] dp = new int[prices.length+1][2][k+1];

        for(int row[][]: dp){
            for(int col[]: row){
                Arrays.fill(col, 0);
            }
        }

        for(int i = prices.length-1; i>=0; i--){
            for(int buy = 0; buy<=1; buy++){
                for(int cap = 1; cap<= k; cap++){
                    if(buy == 0){
                        dp[i][buy][cap] = Math.max(dp[i+1][1][cap]- prices[i], dp[i+1][0][cap]);
                    }else{
                        dp[i][buy][cap] = Math.max(dp[i+1][0][cap-1]+ prices[i], dp[i+1][1][cap]);
                    }
                }
            }
        }

        return dp[0][0][k];

     }
}