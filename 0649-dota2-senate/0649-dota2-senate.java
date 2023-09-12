import java.util.*;
class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> dir = new LinkedList<>();
        Queue<Integer> rad = new LinkedList<>();

        int n = senate.length();
        for(int i =0; i<n; i++){
            if(senate.charAt(i) == 'R'){
                rad.add(i);
            }else{
                dir.add(i);
            }
        }

        while(!rad.isEmpty() && !dir.isEmpty()){
            if(rad.peek() > dir.peek()){
                dir.add(n++);
            }else{
                rad.add(n++);
            }
            rad.remove();
            dir.remove();
        }
        return dir.isEmpty() ? ("Radiant") : ("Dire");
    }
}