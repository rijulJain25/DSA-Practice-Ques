class Solution {
    public void nextPermutation(int[] nums) {
        int pt1 = nums.length-2;
        int pt2 = nums.length-1;

        while(pt1>=0){
            if(nums[pt1] < nums[pt1+1]){
                break;
            }else{
                pt1--;
            }
        }

        if(pt1== -1){
            for(int i = 0; i< nums.length/2; i++){
                int temp = nums[i];
                nums[i] = nums[nums.length-i-1];
                nums[nums.length-i-1] = temp;
            }
        }else{
            while(pt2>=0){
                if(nums[pt2]> nums[pt1]){
                    break;
                }else{
                    pt2--;
                }
            }
            int temp = nums[pt1];
            nums[pt1] = nums[pt2];
            nums[pt2] = temp;

            int pt3 = pt1+1;

            for(int i = 0; i<(nums.length-pt3)/2; i++){
                int temp2 = nums[pt3+i];
                nums[pt3+i] = nums[nums.length-i-1];
                nums[nums.length-i-1] = temp2;
            }
        }
    }
}