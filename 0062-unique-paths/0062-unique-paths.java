class Solution {

    public int uniquePathsHelp(int dp[][], int right, int bottom){
        if(right == 0 && bottom == 0){
            return 1;
        }
        if(right < 0 || bottom < 0){
            return 0;
        }
        if(dp[bottom][right] != -1){
            return dp[bottom][right];
        }
        int up = uniquePathsHelp(dp, right, bottom-1);
        int down = uniquePathsHelp(dp, right-1, bottom);
        return dp[bottom][right] = up+down;
    }

    public int uniquePaths(int m, int n) {
        int dp[][]= new int[m][n];
        for (int[] row : dp)
            Arrays.fill(row, -1);
        return uniquePathsHelp(dp, n-1, m-1);
    }
}