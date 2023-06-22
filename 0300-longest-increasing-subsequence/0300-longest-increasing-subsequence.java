class Solution {

    // public static int getSequence(int[] nums, int n, int str, int prev, int[][] dp){
    //     if(str == n){
    //         return 0;
    //     }
    //     if(dp[str][prev+1] != -1){
    //         return dp[str][prev+1] ;
    //     }

    //     int not = 0+getSequence(nums, n, str+1, prev, dp);
    //     int take = 0;
    //     if(prev == -1 || nums[str]>nums[prev]){
    //         take = 1+getSequence(nums, n, str+1, str, dp);
    //     }

    //     return dp[str][prev+1] = Math.max(not, take);
    // }

    public static int chkFunc(ArrayList<Integer> arr, int x){
        for(int i = 0; i< arr.size(); i++){
            if(x<=arr.get(i)){
                return i;
            }
        }
        return -1;
    }

    public int lengthOfLIS(int[] nums) {
        // int n = nums.length;
        // int[][] dp = new int[n][n+1];
        // for(int row[] : dp){
        //     Arrays.fill(row, -1);
        // }

        // return getSequence(nums, n, 0, -1, dp);

        ArrayList<Integer> dp = new ArrayList<>();
        // int j = 0;
        dp.add(nums[0]);
        for(int i= 1; i< nums.length; i++){
            if(nums[i]> dp.get(dp.size()-1)){
                // j++;
                dp.add(nums[i]);
            }else{
                int chk = chkFunc(dp, nums[i]);
                dp.set(chk, nums[i]);
            }
        }
        return dp.size();
    }
}