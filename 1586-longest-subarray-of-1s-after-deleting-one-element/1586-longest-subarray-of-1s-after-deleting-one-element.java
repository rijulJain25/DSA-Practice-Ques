class Solution {
    public int longestSubarray(int[] nums) {
        int c1 = 0;
        int c2 = 0;
        int maxi = 0;
        for(int i : nums){
            if(i == 0){
                maxi = Math.max(maxi, c1+c2);
                c2 = c1;
                c1 = 0;
            }else{
                c1++;
            }
        }
        if(c1+ c2 == nums.length){
            return nums.length-1;
        }   
        return Math.max(maxi, c1+c2);
    }
}