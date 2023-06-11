class Solution {
    public int findKthPositive(int[] arr, int k) {
        int low = 0;
        int high = arr.length-1;

        while(low<=high){
            int mid = (low+high)/2;
            int missingNo = arr[mid]-(mid+1);
        
            if(missingNo == k){
                if(mid>0 && (arr[mid-1] -(mid)) == k){
                    high = mid-1;
                    continue;
                }

                return arr[mid]-1;
            }else if(missingNo < k){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        
        if (high < 0)
            return k;
 
        int less = arr[high] - (high + 1);
        k -= less;
 
        return arr[high] + k;
    }
}