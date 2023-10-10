class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        int[] dp = new int[nums.length];
        int[] hash = new int[nums.length];
        Arrays.fill(dp, 1);
        Arrays.fill(hash, 0);

        for(int i = 0; i<n ;i++){
            hash[i] = i;
            for(int prev = 0; prev <=i-1; prev++){
                if(nums[i]%nums[prev] == 0 && 1+dp[prev]> dp[i]){
                    dp[i] = 1+dp[prev];
                    hash[i] = prev;
                }
            }
        }

        int ans = -1;
        int lstIdx = -1;
        for(int i = 0; i<n; i++){
            if(dp[i] > ans){
                ans = dp[i];
                lstIdx = i;
            }
        }

        List<Integer> list = new ArrayList<>();
        list.add(nums[lstIdx]);

        while(hash[lstIdx] != lstIdx){
            lstIdx = hash[lstIdx];
            list.add(nums[lstIdx]);
        }

        Collections.reverse(list);
        return list;

    }
}