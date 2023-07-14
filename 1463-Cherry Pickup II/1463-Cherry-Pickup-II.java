class Solution {
    
    public static int helper(int[][] arr, int i, int j1, int j2, int n, int m, int[][][] dp){
        if(j1<0 || j1>m-1 || j2<0 || j2>m-1){
            return -100000;
        }
        if(i == n-1){
            if(j1 == j2){
                return arr[i][j1];
            }
            else{
                return arr[i][j1]+ arr[i][j2];
            }
        }

        if(dp[i][j1][j2] != -1){
            return dp[i][j1][j2];
        }

        int maxi = Integer.MIN_VALUE;
        for(int k = -1; k<=1; k++){
            for(int j = -1; j<=1; j++){
                int ans = arr[i][j1];
                if(j1 == j2){
                    ans += helper(arr, i+1, j1+k, j2+j, n, m, dp);
                }
                else{
                    ans += arr[i][j2]+helper(arr, i+1, j1+k, j2+j, n, m, dp);
                }
                maxi = Math.max(maxi, ans);
            }
        }
        return dp[i][j1][j2]= maxi;
    }

    public int cherryPickup(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][][] dp = new int[n][m][m];
        for(int[][] row : dp){
            for(int[] r : row){
                Arrays.fill(r, -1);
            }
        }
        return helper(grid, 0, 0, m-1, n, m, dp);
    }
}