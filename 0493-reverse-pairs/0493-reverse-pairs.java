class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length-1);
    }

    public static int merge(int[] nums, int str, int mid, int high){
        int right = mid+1;
        int count = 0;
        for(int i = str; i<=mid; i++){
            while(right<= high && nums[i] > (2*(long)nums[right])){
                right++;
            }
            count += (right -(mid+1));
        }
        int st1 = str;
        int st2 = mid+1;
        ArrayList<Integer> arr= new ArrayList<>();
        while(st1<=mid && st2<= high){
            if(nums[st1] > nums[st2]){
                arr.add(nums[st2]);
                st2++;
            }else{
                arr.add(nums[st1]);
                st1++;
            }
        }

        while(st1<=mid){
            arr.add(nums[st1]);
            st1++;
        }

        while(st2<=high){
            arr.add(nums[st2]);
            st2++;
        }
        for(int i=str;i<=high;i++){
            nums[i]=arr.get(i-str);
        }
        return count;
    }

    public static int mergeSort(int[] nums, int str, int end){
        if(str>=end){
            return 0;
        }
        int mid = (str+end)/2;
        int inv = mergeSort(nums, str, mid);
        inv += mergeSort(nums, mid+1, end);
        inv += merge(nums, str, mid, end);
        return inv;
}
}