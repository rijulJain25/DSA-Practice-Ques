class Solution {

    public static int helper(String s1, String s2, int dp[][], int i, int j){
        if(i <0 || j<0){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if(s1.charAt(i) == s2.charAt(j)){
            dp[i][j] = 1+helper(s1, s2, dp, i-1, j-1);
        }else{
            dp[i][j] = Math.max(helper(s1, s2, dp, i-1, j), helper(s1, s2, dp, i, j-1));
        }
        return dp[i][j];
    }

    public int minDistance(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
    
        int dp[][] = new int[n+1][m+1];
        for(int row[] : dp){
            Arrays.fill(row, -1);
        }
        int k = helper(s1, s2, dp, n-1, m-1);
        return (n-k)+(m-k);
    }
}