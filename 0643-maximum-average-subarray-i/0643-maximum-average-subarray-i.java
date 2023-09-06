class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        int window = 0;
        for(int i = 0; i<nums.length; i++){
            sum += nums[i];
            if(i>=k-1){
                maxi = Math.max(maxi, sum);
                sum -= nums[window++];
            }
        }
        return (double)maxi/k; 
    }
}