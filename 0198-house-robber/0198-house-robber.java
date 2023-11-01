class Solution {

    public int rob(int[] nums) {
        int prev1 = nums[0];
        int prev2 = 0;
        int maxi = 0;
        for(int i =1; i<nums.length; i++){
            int take = nums[i];
            if(i>1){
                take +=prev2;
            }
            int not = 0+prev1;
            int ans = Math.max(take, not);
            prev2 = prev1;
            prev1 = ans;
        }
        return prev1;
    }
}