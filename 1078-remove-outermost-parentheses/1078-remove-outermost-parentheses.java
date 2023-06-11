class Solution {
    public String removeOuterParentheses(String s) {

        int openCnt = 0;
        int closeCnt = 0;
        int str = 0;
        String ans = "";
        for(int i = 0 ;i<s.length(); i++){
            if(s.charAt(i) == '('){
                openCnt++;
            }else if(s.charAt(i) == ')'){
                closeCnt++;
            }

            if(openCnt == closeCnt){
                ans += s.substring(str+1, i);
                str = i+1;
            }
        }
        return ans;
        
    }
}