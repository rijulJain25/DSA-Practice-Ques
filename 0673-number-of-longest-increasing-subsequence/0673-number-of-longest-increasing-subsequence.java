class Solution {
    public int findNumberOfLIS(int[] nums) {

        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);

        int curr[]= new int[nums.length];
        Arrays.fill(curr, 1);

        int maxm = -1;
        for(int i = 0; i<nums.length; i++){
            for(int prev = 0; prev< i; prev++){
                if(nums[i]>nums[prev] && dp[i]<1+dp[prev]){
                    dp[i] = 1+dp[prev];
                    curr[i] = curr[prev];
                }else if(nums[i]> nums[prev] && dp[i] == 1+dp[prev]){
                    curr[i] += curr[prev];
                }
            }
            maxm = Math.max(maxm ,dp[i]);
        }
        int ans = 0;
        for(int i= 0; i<nums.length; i++){
            if(dp[i] == maxm){
                ans += curr[i];
            }
        }
        return ans;
    }
}