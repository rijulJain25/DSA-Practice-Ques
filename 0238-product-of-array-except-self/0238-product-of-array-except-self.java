class Solution {
    public int[] productExceptSelf(int[] nums) {
        // int count = 0; 
        // int prod = 1;
        // for(int i = 0; i<nums.length; i++){
        //     count += nums[i] == 0 ? 1: 0;
        //     prod *= nums[i] == 0 ? 1: nums[i];
        // }

        // for(int i = 0; i<nums.length; i++){
        //     nums[i] = nums[i] == 0 ? (count> 1? 0 : (int)prod) : (count > 0 ? 0 : (int)(prod/nums[i]));
        // }
        // System.gc();
        // return nums;

        int right = 1;
        int left = 1;
        int op[] = new int[nums.length];

        for(int i = nums.length-1; i>= 0; i--){
            op[i] = right;
            right *= nums[i];
        } 

        for(int j = 0; j<nums.length; j++){
            op[j] *= left;
            left *= nums[j];
        } 
        return op;
    }
}