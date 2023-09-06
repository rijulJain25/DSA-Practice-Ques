class Solution {
    public int longestOnes(int[] nums, int k) {
        int end = 0;
        int str = 0;
        int cnt = 0;
        while(end < nums.length){
            if(nums[end] == 0){
                cnt++;
            }
            end++;
            if(cnt > k){
                if(nums[str] == 0){
                    cnt--;
                }
                str++;
            }
        }
        return end - str;
    }
}