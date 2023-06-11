import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> s = new HashMap<>();
        // int max = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length; i++){
            if(s.containsKey(nums[i])){
                s.put(nums[i], s.get(nums[i])+1);
            }else{
                s.put(nums[i], 1);
            }
        }
        for(int i = 0; i<nums.length; i++){
            if(s.get(nums[i]) > (nums.length/2)){
                return nums[i];
            }
        }
        return -1;
    }
}