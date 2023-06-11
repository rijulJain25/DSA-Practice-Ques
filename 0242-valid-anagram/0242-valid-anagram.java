class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        
        int[] chk = new int[26];

        for(int i = 0; i< s.length(); i++){
            chk[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i< t.length(); i++){
            chk[t.charAt(i) - 'a']--;
        }

        for(int i = 0; i< chk.length; i++){
            if(chk[i] != 0){
                return false;
            }
        }
        return true;
    }
}