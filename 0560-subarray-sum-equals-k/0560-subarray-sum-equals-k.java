class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0;
        int ans = 0;
        HashMap<Integer, Integer> s = new HashMap<>();
        s.put(0,1);
        for(int i = 0; i<nums.length; i++){
            sum += nums[i];
            if(s.containsKey(sum-k)){
                ans += s.get(sum-k);
            }
            s.put(sum,s.getOrDefault(sum,0)+1);
        }
        
        return ans;
    }
}