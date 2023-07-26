class Solution {

    public static int helper(String s, String t, int i, int j, int dp[][]){
        if(i <0 && j<0){
            return 1;
        }
        if(i<0 && j>=0){
            return 0;
        }
        if(i>=0 && j<0){
            for(int k= 0; k<=i; k++){
                if(s.charAt(k) != '*'){
                    return 0;
                }
            }
            return 1;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        if(s.charAt(i) == t.charAt(j) || s.charAt(i) == '?'){
            return dp[i][j] = helper(s, t, i-1, j-1, dp);
        }
        else{
            if(s.charAt(i) == '*'){
                return dp[i][j] = (helper(s, t, i-1, j, dp) == 1 || helper(s, t, i, j-1, dp) == 1)? 1:0;
            }else{
                return 0;
            }
        }
    }

    public boolean isMatch(String s, String p) {
        int dp[][] = new int[p.length()][s.length()];

        for(int row[]: dp){
            Arrays.fill(row, -1);
        }

        if(helper(p, s, p.length()-1, s.length()-1, dp) == 1){
            return true;
        }else{
            return false;
        }
    }
}