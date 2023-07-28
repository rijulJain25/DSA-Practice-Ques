class Solution {
    public int maxProfit(int k, int[] prices) {
        
        int[][] prev = new int[2][k+1];
        int[][] curr = new int[2][k+1];

        for(int col[]: prev){
            Arrays.fill(col, 0);
        }

        for(int col[]: curr){
            Arrays.fill(col, 0);
        }

        for(int i = prices.length-1; i>=0; i--){
            for(int buy = 0; buy<=1; buy++){
                for(int cap = 1; cap<= k; cap++){
                    if(buy == 0){
                        curr[buy][cap] = Math.max(prev[1][cap]- prices[i], prev[0][cap]);
                    }else{
                        curr[buy][cap] = Math.max(prev[0][cap-1]+ prices[i], prev[1][cap]);
                    }
                }
            }
            prev = curr;
        }

        return curr[0][k];

     }
}