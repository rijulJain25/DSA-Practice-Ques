class Solution {
    public int xorOperation(int n, int start) {
        int ans = 0;
        int val = 0;
        for(int i = 0; i<n; i++){
            val = start+2*i;
            ans = ans ^ val;
        }
        return ans;
    }
}