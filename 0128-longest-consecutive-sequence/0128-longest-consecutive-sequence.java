import java.util.Arrays;

class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<=1){
            return nums.length;
        }
        Arrays.sort(nums);
        int count = 0;
        int newCnt = 0;
        for(int i = 1; i<nums.length; i++){
            if(nums[i] == nums[i-1]+1){
                newCnt++;
                if(newCnt > count){
                    count = newCnt;
                }
            }else if(nums[i] == nums[i-1]){
                continue;
            }else{
                newCnt = 0;
                if(newCnt > count){
                    count = newCnt;
                }
            }
        }
        return count+1;
    }
}