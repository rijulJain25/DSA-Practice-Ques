class Solution {
    public static int helper(int arr[][], int i, int j, int[][] dp){
        if(i == 0 && j == 0){
            return 1;
        }
        if(i>=0 && j>=0 && arr[i][j] == 1){
            return 0;
        }
        if(i<0 || j<0){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        dp[i][j] = helper(arr, i-1, j, dp)+helper(arr, i, j-1, dp);
        return dp[i][j];
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length; int n = obstacleGrid[0].length;
        int dp[][] = new int[m][n];
        if(obstacleGrid[0][0] == 1){
            return 0;
        }
        for(int rows[]: dp){
            Arrays.fill(rows, -1);
        }
        return helper(obstacleGrid, m-1, n-1, dp);
    }

}