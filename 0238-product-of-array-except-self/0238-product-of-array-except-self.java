class Solution {
    public int[] productExceptSelf(int[] nums) {
        int count = 0; 
        int prod = 1;
        for(int i = 0; i<nums.length; i++){
            count += nums[i] == 0 ? 1: 0;
            prod *= nums[i] == 0 ? 1: nums[i];
        }

        for(int i = 0; i<nums.length; i++){
            nums[i] = nums[i] == 0 ? (count> 1? 0 : (int)prod) : (count > 0 ? 0 : (int)(prod/nums[i]));
        }
        System.gc();
        return nums;
    }
}