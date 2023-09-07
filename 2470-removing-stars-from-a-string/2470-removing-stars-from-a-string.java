import java.util.*;
class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        if(s.charAt(0) != '*'){
            st.push(s.charAt(0));
        }
        StringBuilder str = new StringBuilder();
        for(int i = 1; i<s.length(); i++){
            if(s.charAt(i) == '*'){
                if(!st.isEmpty()){
                    st.pop();
                }
            }else{
                st.push(s.charAt(i));
            }
        }
        for(char c: st){
            str.append(c);
        }

        return str.toString();
    }
}