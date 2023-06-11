class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0){
            return true;
        }
        if(s.length() == 0 && t.length() == 0){
            return true;
        }
        if(s.length() != 0 && t.length() == 0){
            return false;
        }
        int idxCnt1 = 0;
        int idxCnt2 = 0;
        while(idxCnt1 <t.length() && idxCnt2 < s.length()){
            if(s.charAt(idxCnt2) == t.charAt(idxCnt1)){
                idxCnt2++;
            }
            idxCnt1++;
        }
        return idxCnt2 == s.length();
    }
}