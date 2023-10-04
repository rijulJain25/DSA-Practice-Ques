class Solution {
    public int maxRotateFunction(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int dp[] = new int[nums.length];
        int sum = 0; 
        int k = 0; 
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length; i++){
            sum += nums[i];
            k += i*nums[i];
        }
        dp[0] = k;
        maxi = dp[0];
        for(int i = 1; i<nums.length; i++){
            dp[i] = dp[i-1]+sum - (nums.length * nums[nums.length-i]);
            maxi = Math.max(maxi, dp[i]);
        }

        return maxi;
    }
}