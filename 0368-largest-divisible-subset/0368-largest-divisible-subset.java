import java.util.*;

class Solution {

    public static List<Integer> largestDivisibleSubset(int[] nums) {

        int n = nums.length;
        Arrays.sort(nums);

        int dp[] = new int[n];
        Arrays.fill(dp, 1);
        int hash[] = new int[n];
        Arrays.fill(hash, 1);
        for(int i = 0; i< n; i++){
            hash[i] = i;
            for(int prev = 0; prev<=i-1; prev++){
                if(nums[i]%nums[prev] == 0 && dp[i]<dp[prev]+1){
                    dp[i] = dp[prev]+1;
                     hash[i] = prev;
                }
            }
        }
        int ans = -1;
        int lstIdx = -1;
        for(int i = 0; i<n; i++){
            if(dp[i]>ans){
                ans = dp[i];
                lstIdx = i;
            }
        }

        List<Integer> list= new ArrayList<>();
        list.add(nums[lstIdx]);
        while(hash[lstIdx]!=lstIdx){
            lstIdx = hash[lstIdx];
            list.add(nums[lstIdx]);
        }
        Collections.reverse(list);
        return list;
    }
}