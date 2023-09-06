class Solution {
    public int maxVowels(String s, int k) {
        int cntVowel = 0;
        int cnt = 0;
        int window = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' ||s.charAt(i) == 'i' ||s.charAt(i) == 'o' ||s.charAt(i) == 'u'){
                cntVowel++;
            }
            if(i>=k-1){
                cnt = Math.max(cnt, cntVowel);
                if(s.charAt(window) == 'a' || s.charAt(window) == 'e' ||s.charAt(window) == 'i' ||s.charAt(window) == 'o' ||s.charAt(window) == 'u'){
                    cntVowel--;
                }
                window++;
            }
        }
        return cnt;
    }
}