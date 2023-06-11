class Solution {

    public static int BinSearch(int[] nums, int low, int high, int target){
        while(low <= high){
            int mid = (low + high) >> 1;
            if(nums[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return low;
    }

    public int[] searchRange(int[] nums, int target) {
        int low = 0; int high = nums.length-1;
        int str = BinSearch(nums, low, high, target);
        int end = BinSearch(nums, low, high, target+1)-1;
        if(str<nums.length && nums[str] == target){
            int arr[] = new int[2];
            arr[0] = str;
            arr[1] = end;
            return arr;
        }
        int arr[] = new int[2];
        arr[0] = -1;
        arr[1] = -1;
        return arr;
    }
}