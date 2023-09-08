class Solution {
    public int equalPairs(int[][] grid) {
        int i = 0, j = 0;
        int cnt = 0, k;
        while(i<grid.length){
            if(j == grid.length){
                j = 0;
                i++;
            }
            if(i == grid.length){
                return cnt;
            }
            for(k = 0; k<grid.length; k++){
                if(grid[k][i] != grid[j][k]){
                    break;
                }
            }
            if(k == grid.length){
                cnt++;
            }
            j++;
        }
        return 0;
    }
}