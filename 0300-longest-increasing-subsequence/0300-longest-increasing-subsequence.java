class Solution {

    public static int getSequence(int[] nums, int n, int str, int prev, int[][] dp){
        if(str == n){
            return 0;
        }
        if(dp[str][prev+1] != -1){
            return dp[str][prev+1] ;
        }

        int not = 0+getSequence(nums, n, str+1, prev, dp);
        int take = 0;
        if(prev == -1 || nums[str]>nums[prev]){
            take = 1+getSequence(nums, n, str+1, str, dp);
        }

        return dp[str][prev+1] = Math.max(not, take);
    }

    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n+1];
        for(int row[] : dp){
            Arrays.fill(row, -1);
        }

        return getSequence(nums, n, 0, -1, dp);
    }
}