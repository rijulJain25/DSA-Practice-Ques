import java.util.*;

class Solution {

    // public static int helper(int nums[], int str, int prev, int[][] dp){
    //     if(str == nums.length){
    //         return 0;
    //     }
    //     if(dp[str][prev+1] != -1){
    //         return dp[str][prev+1];
    //     }

    //     int not = helper(nums, str+1, prev, dp);
    //     int take = 0;
    //     if(prev == -1 || nums[str] > nums[prev]){
    //         take = 1+ helper(nums, str+1, str, dp);
    //     }
    //     return dp[str][prev+1] = Math.max(not, take);
    // }

    public int lengthOfLIS(int[] nums) {
        // int dp[] = new int[nums.length+1];
        // int curr[] = new int[nums.length+1];

        // for(int i = nums.length-1; i>= 0; i--){
        //     for(int prev = i-1; prev>= -1; prev--){
        //         int not = dp[prev+1];
        //         int take = 0;
        //         if(prev == -1 || nums[i] > nums[prev]){
        //             take = 1+ dp[i+1];
        //         }

        //         curr[prev+1] = Math.max(take, not);
        //     }
        //     dp = curr;
        // }

        // return curr[0];

        List<Integer> sub = new ArrayList<>();

        for (int num : nums) {
            int i = Collections.binarySearch(sub, num);

            if (i < 0) {
                i = -(i + 1);
            }

            if (i == sub.size()) {
                sub.add(num);
            } else {
                sub.set(i, num);
            }
        }
        
        return sub.size();
    }
}