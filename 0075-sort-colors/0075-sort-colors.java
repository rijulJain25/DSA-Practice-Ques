class Solution {
    public void sortColors(int[] nums) {
        int str = 0; int next = 0; int end = nums.length-1;
        while(next<=end){
            if(nums[next] == 0){
                int temp = nums[next];
                nums[next] = nums[str];
                nums[str] = temp;
                next++;
                str++;
            }
            else if(nums[next] == 1){
                next++;
            }else{
                int temp = nums[next];
                nums[next] = nums[end];
                nums[end] = temp;
                end--;
            }
        }
    }
}