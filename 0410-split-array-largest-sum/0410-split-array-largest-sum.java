class Solution {

    public static int isPossible(int[] nums, int k, int mid){
        int cnt = 1;
        int tempSum = 0;
        for(int i = 0; i<nums.length; i++){
            if(tempSum+ nums[i] <=mid){
                tempSum += nums[i];
            }else{
                cnt++;
                tempSum = nums[i];
            }
        }
        return cnt;
    }

    public int splitArray(int[] nums, int k) {
        int low = 0;
        int high = 0;
        for(int i = 0; i<nums.length; i++){
            low = Math.max(low, nums[i]);
            high += nums[i];
        }
        int res= -1;
        while(low<= high){
            int mid = (low+high)/2;
            int cnt = isPossible(nums, k, mid);
            if(cnt<= k){
                res = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return res;
    }
}