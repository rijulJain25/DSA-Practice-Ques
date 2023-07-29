class Solution {

    public static int helper(int nums[], int str, int prev, int[][] dp){
        if(str == nums.length){
            return 0;
        }
        if(dp[str][prev+1] != -1){
            return dp[str][prev+1];
        }

        int not = helper(nums, str+1, prev, dp);
        int take = 0;
        if(prev == -1 || nums[str] > nums[prev]){
            take = 1+ helper(nums, str+1, str, dp);
        }
        return dp[str][prev+1] = Math.max(not, take);
    }

    public int lengthOfLIS(int[] nums) {
        int dp[][] = new int[nums.length][nums.length+1];

        for(int row[] : dp){
            Arrays.fill(row, -1);
        }

        return helper(nums, 0, -1, dp);
    }
}