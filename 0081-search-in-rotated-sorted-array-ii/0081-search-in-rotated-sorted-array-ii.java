class Solution {
    public boolean search(int[] nums, int target) {
        int str = 0; 
        int end = nums.length-1;
        while(str<=end){
            int mid = str + (end-str)/2;

            if(nums[mid] == target){
                return true;
            }
            
            if(nums[str] == nums[mid] && nums[end] == nums[mid]){
                str++;
                end--;
            } 
            else if(nums[str]<=nums[mid]){
                if(target >= nums[str] && target <= nums[mid]){
                    end = mid-1;
                }else{
                    str = mid+1;
                }
            }else{
                if(target >= nums[mid+1] && target <= nums[end]){
                    str = mid+1;
                }else{
                    end = mid-1;
                }
            }
        }
        return false;
    }
}