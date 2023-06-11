class Solution {
    public int singleNonDuplicate(int[] nums) {
        int str = 0;
        int end = nums.length-1;
        while(str< end){
            int mid = (str+end)/2;

            if(mid%2==1){
                mid--;
            }
            if(nums[mid] != nums[mid+1]){
                end = mid;
            }else{
                str = mid+2;
            }
        }
        return nums[str];
    }
}