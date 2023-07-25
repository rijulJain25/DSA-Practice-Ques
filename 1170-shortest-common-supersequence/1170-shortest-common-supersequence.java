class Solution {
    public String shortestCommonSupersequence(String s1, String s2) {
    // find the LCS of s1 and s2
    int m = s1.length(),n=s2.length();
    int dp[][] = new int[m+1][n+1];
    // fill the dp array using dynamic programming
    for(int i=1;i<=m;i++){
        for(int j=1;j<=n;j++){
            if(s1.charAt(i-1)==s2.charAt(j-1)){
                dp[i][j]=1+dp[i-1][j-1];
            }else dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
        }
    }
    // backtrack from the bottom right corner of the dp array to find the LCS
    StringBuilder sb = new StringBuilder();
    int i=m,j=n;
    while(i>0 && j>0){
        if(s1.charAt(i-1)==s2.charAt(j-1)){
            sb.append(s1.charAt(i-1));
            i--;
            j--;
        }else if(dp[i-1][j]>dp[i][j-1]){//shrink s1
        sb.append(s1.charAt(i-1));
         i--;
        }else{
            sb.append(s2.charAt(j-1));
         j--;
        }
    }
    while(i>0){//remaing 1 element in s1
    sb.append(s1.charAt(i-1));
         i--;
    }
     while(j>0){
    sb.append(s2.charAt(j-1));
         j--;
    }
    // reverse the LCS string and return it
    return sb.reverse().toString();
}
}