import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int num;
        for(int i = 0; i<nums.length-1; i+=2){
            if(nums[i] != nums[i+1]){
                num = nums[i];
                return num;
            }
        }
        return nums[nums.length-1];
    }
}