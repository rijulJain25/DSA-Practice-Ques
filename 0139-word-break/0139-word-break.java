class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashMap<String,Integer>h1=new HashMap<>();
        for(String str:wordDict){
            h1.put(str,1);
        }
        int n=s.length();
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return helper(s,0,h1,dp)==1;
    }
    int  helper(String s,int i,HashMap<String,Integer>h1,int dp[]){
        if(i==s.length()){
            return 1;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        for(int j=i;j<s.length();j++){
            if(isfound(s.substring(i,j+1),h1)){
               int ans= helper(s,j+1,h1,dp);
               dp[i]=ans;
               if(ans==1){
                   return 1;
               }
            }
        }
        return 0;
    }
    boolean isfound(String s,HashMap<String,Integer>h1){
        if(h1.containsKey(s)){
            return true;
        }
        return false;
    }
}