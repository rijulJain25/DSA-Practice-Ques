class Solution {
    public int pivotIndex(int[] nums) {

        int sum = 0;

        for(int i = 0; i< nums.length; i++){
            sum += nums[i];
        }

        int leftsum = 0;
        for(int i = 0; i<nums.length; leftsum += nums[i++]){
            if(leftsum *2 == sum-nums[i]){
                return i;
            }
        }
        return -1;
    }
}