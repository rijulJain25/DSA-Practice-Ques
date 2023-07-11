class Solution {

    public static int miniHelp(List<List<Integer>> list, int i, int last, int n, int[][] dp){
        if(i == n-1){
            return list.get(i).get(last);
        }
        if(dp[i][last] != -1){
            return dp[i][last];
        }
        int left = list.get(i).get(last)+miniHelp(list, i+1, last, n, dp);
        int right = list.get(i).get(last)+ miniHelp(list, i+1, last+1, n, dp);
        return dp[i][last] = Math.min(left, right);
    }

    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] dp = new int[triangle.size()][triangle.get(triangle.size() - 1).size()];
        for(int[] row: dp){
            Arrays.fill(row, -1);
        }
        return miniHelp(triangle, 0, 0, triangle.size(), dp);
    }
}