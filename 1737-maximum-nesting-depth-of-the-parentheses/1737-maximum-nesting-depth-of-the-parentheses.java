import java.util.*;
class Solution {
    public int maxDepth(String s) {
        int cntOpen = 0;
        int cntClose = 0;
        int maxCnt = 0;
        for(int i = 0; i< s.length(); i++){
            if(s.charAt(i) == '('){
                cntOpen++;
            }else if(s.charAt(i) == ')'){
                if(maxCnt < cntOpen){
                    maxCnt = cntOpen;
                }
                cntOpen--;
            }
        }
        return maxCnt;
    }
}