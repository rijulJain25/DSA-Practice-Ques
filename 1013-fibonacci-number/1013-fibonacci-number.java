class Solution {

    public int fibHelp(int n, int[] dp){
        if(n<= 1){
            return n;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        return dp[n] = fibHelp(n-1, dp)+fibHelp(n-2, dp);
    }

    public int fib(int n) {
        int[] dp = new int[n+1];
        for(int i = 0; i<n+1; i++){
            dp[i] = -1;
        }
        return fibHelp(n, dp);
    }
}