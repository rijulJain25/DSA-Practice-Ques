class Solution {

    public static boolean ChkDivisor(int[] a, int m, int h){
        for (int x : a)
            if ((h -= (x + m-1)/m) < 0) return false;
        return true;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1; 
        int high = nums[0];

        for(int i = 0; i< nums.length; i++){
            if(nums[i] > high){
                high = nums[i];
            }
        }
        // int res = -1;
        while(low< high){

            int mid = (low+high)/2;

            if(ChkDivisor(nums, mid, threshold)){
                high = mid;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
}