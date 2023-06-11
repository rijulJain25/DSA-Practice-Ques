class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];
        int j = 0;
        int i = j+1;
        while(i<nums.length){
            if(nums[i]+nums[j] == target){
                arr[0] = j; 
                arr[1] = i;
                break;
            }else if(i == nums.length-1){
                j = j+1;
                i = j+1;
            }else{
                i++;
            }
        }
        return arr;
    }
}