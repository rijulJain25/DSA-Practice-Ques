class Solution {

    // public int uniquePathsHelp(int dp[][], int right, int bottom){
    //     if(right == 0 && bottom == 0){
    //         return 1;
    //     }
    //     if(right < 0 || bottom < 0){
    //         return 0;
    //     }
    //     if(dp[bottom][right] != -1){
    //         return dp[bottom][right];
    //     }
    //     int up = uniquePathsHelp(dp, right, bottom-1);
    //     int down = uniquePathsHelp(dp, right-1, bottom);
    //     return dp[bottom][right] = up+down;
    // }

    public int uniquePaths(int m, int n) {
        int dp[]= new int[n];
        for(int i = 0; i<m; i++){
            int temp[]= new int[n];
            for(int j = 0; j<n; j++){
                if(i == 0 && j == 0){
                    temp[j] = 1;
                    continue;
                }
                int up = 0;
                int down = 0;
                if(i>0){
                    up = dp[j];
                }
                if(j>0){
                    down = temp[j-1];
                }
                temp[j] = up+down;
            }
            dp = temp;
        }
        return dp[n-1];
    }
}