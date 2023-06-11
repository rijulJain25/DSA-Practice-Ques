class Solution {

    public static void inverting(int[] nums, int str, int end){
        while(str<end){
            int temp = nums[str];
            nums[str] = nums[end];
            nums[end] = temp;
            str++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        if(nums == null || nums.length == 0){
            return;
        }
        k = k%nums.length;
        inverting(nums, 0, nums.length-1);
        inverting(nums, 0, k-1);
        inverting(nums, k, nums.length-1);
        
    }
}