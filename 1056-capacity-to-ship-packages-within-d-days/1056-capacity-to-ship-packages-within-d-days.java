class Solution {

    public static boolean CanBeShipped(int[] nums, int days, int max){
        int count_weight=0;
        int count_days=1;

        for(int i=0;i< nums.length;i++){
            if(count_weight+ nums[i]> max)
            {
                count_days++;
                count_weight= nums[i];

            }else count_weight+= nums[i];

        }
        return count_days<=days;
    }

    public int shipWithinDays(int[] weights, int days) {
        int low =1;
        int high = 0;
        for(int i = 0; i<weights.length; i++){
            low = Math.max(low, weights[i]);
            high += weights[i]; 
        }
        int res = -1;
        while(low<=high){
            int mid = (low+high)/2;

            if(CanBeShipped(weights, days, mid)){
                res = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return res;
    }
}








