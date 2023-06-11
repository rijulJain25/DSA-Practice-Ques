class Solution {
    public int[] rearrangeArray(int[] nums) {
        int arr[] = new int[nums.length];        
        int cnt1 = 0;
        int cnt2 = 1;
        int k = 0;
        while(k< nums.length){
            if(nums[k] < 0){
                arr[cnt2] = nums[k];
                cnt2 += 2;
            }else{
                arr[cnt1] = nums[k];
                cnt1 += 2;
            }
            k++;
        }

        return arr;
    
    }
}