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
        int dp[][]= new int[m][n];
        for (int[] row : dp)
            Arrays.fill(row, -1);
        
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(i == 0 && j == 0){
                    dp[i][j] = 1;
                    continue;
                }
                int up = 0;
                int down = 0;
                if(i>0){
                    up = dp[i-1][j];
                }
                if(j>0){
                    down = dp[i][j-1];
                }
                dp[i][j] = up+down;
            }
        }
        return dp[m-1][n-1];
    }
}