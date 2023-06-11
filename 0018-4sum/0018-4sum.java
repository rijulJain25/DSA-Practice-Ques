class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        if(nums==null || nums.length==0) return ans;
        int n=nums.length;
        
        
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            long target2=(long)target-(long)nums[i];

            for(int j=i+1;j<n;j++){
                long remaining=(long)target2-(long)nums[j];

                int first=j+1;
                int last=n-1;
                while(first<last){
                    long twoSum=(long)nums[first]+(long)nums[last];
                    if(twoSum<remaining) {
                        first++;
                    }
                    else if(twoSum>remaining) {
                        last--;
                    }
                    else{
                        List<Integer>res=new ArrayList<>();
                        res.add(nums[i]);//num 1
                        res.add(nums[j]);//num 2
                        res.add(nums[first]);//num 3
                        res.add(nums[last]);//num 4
                        ans.add(res);

                        // Processing the duplicates of number 3
                        while(first<last && nums[first]==res.get(2)) first++;

                        // Processing the duplicates of number 4
                        while(first<last && nums[last]==res.get(3)) last--;
                    }
                }
                // Processing the duplicates of number 2
                while(j+1<n && nums[j+1]==nums[j]) j++;
            }
            // Processing the duplicates of number 1
            while(i+1<n && nums[i+1]==nums[i]) i++;
        }
        return ans;
    }
}