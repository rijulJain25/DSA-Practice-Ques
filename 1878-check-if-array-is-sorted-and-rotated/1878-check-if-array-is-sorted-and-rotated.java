class Solution {
    public boolean check(int[] nums) {
        int rotateArr = 0;
		
		for(int i = 1; i< nums.length; i++) {
			if(nums[i]<nums[i-1]) {
                rotateArr++;
                if(rotateArr > 1){
                    return false;
                }
            }
		}
        if(rotateArr == 1){
            return nums[nums.length-1] <= nums[0];
        }
		return true;
    }
}   