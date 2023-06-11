class Solution {
    public int search(int[] nums, int target) {
        return SearchBin(nums, target, 0, nums.length-1);
    }

    public static int SearchBin(int[] nums, int target, int str, int end){
        if(str>end){
            return -1;
        }
        int mid = (str+end)/2;
        if(nums[mid] < target){
            return SearchBin(nums, target, mid+1, end);
        }else if(nums[mid] > target){
            return SearchBin(nums, target, str, mid-1);
        }else{
            return mid;
        }
    }
}