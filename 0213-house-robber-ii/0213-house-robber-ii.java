class Solution {

    public static int helper(List<Integer> list){
        int prev1 = list.get(0);
        int prev2 = 0;
        for(int i= 1; i<list.size(); i++){
            int take = list.get(i);
            if(i>1){
                take += prev2;
            }
            int notTake = 0+prev1;

            int curr = Math.max(take, notTake);
            prev2 = prev1;
            prev1=curr;
        }
        return prev1;
    }

    public int rob(int[] nums) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        if(nums.length == 1){
            return nums[0];
        }
        for(int i = 0; i<nums.length; i++){
            if(i != 0){
                list2.add(nums[i]);
            }
            if(i != nums.length-1){
                list1.add(nums[i]);
            }
        }
        int val1 = helper(list1);
        int val2 = helper(list2);
        return Math.max(val1, val2);

    }
}