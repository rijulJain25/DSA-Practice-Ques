class Solution {
    public int findMin(int[] nums) {

        int str = 0; 
        int end = nums.length-1;
        int min = Integer.MAX_VALUE;

        while(str<=end){
            if(nums[str] < nums[end]){
                min = Math.min(min, nums[str]);
                break;
            }
            int mid = (str+end)/2;
            if(nums[str]<= nums[mid]){
                  min = Math.min(min, nums[str]);
                  str = mid+1;
            }else{
                min = Math.min(min, nums[mid]);
                end = mid-1;
            }
        }
        return min;
        
    }
}