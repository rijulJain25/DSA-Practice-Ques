 public boolean canPartition(int[] nums) {
        int totSum=0;
    
    for(int i=0; i<nums.length;i++){
        totSum+= nums[i];
    }
    
    if (totSum%2==1) return false;
    
    else{
        int k = totSum/2;
        int dp[][]=new int[nums.length][k+1];
        for(int row[]: dp)
        Arrays.fill(row,-1);
        return subsetSumUtil(nums.length-1,k,nums,dp);
    } 
    }