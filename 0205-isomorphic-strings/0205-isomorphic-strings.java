import java.util.*;
import java.io.*;

class Solution {

    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Character> checkChar = new HashMap<>();

        char c = 'a';

        for(int i = 0; i< s.length(); i++){
            if(checkChar.containsKey(s.charAt(i))){
                c = checkChar.get(s.charAt(i));
                if(c != t.charAt(i)){
                    return false;
                }
            }else if(!checkChar.containsValue(t.charAt(i))){
                checkChar.put(s.charAt(i), t.charAt(i));
            }else{
                return false;
            }
        }
        return true;
    }
}