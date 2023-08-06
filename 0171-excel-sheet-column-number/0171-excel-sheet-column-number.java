class Solution {

    public int titleToNumber(String columnTitle) {
        int t = 1;
        int n = columnTitle.length();
        int ans = 0;
        for(int i = n-1; i>=0; i--){
            ans += ((columnTitle.charAt(i) -'A'+1)*t);
            t *= 26;
        }
        return ans;
    }
}