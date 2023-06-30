class Solution {
    public static boolean isPalindrome(String str, int st, int end){
        while(st<=end){
            if(str.charAt(st) != str.charAt(end)){
                return false;
            }
            st++;
            end--;
        }
        return true;
    }

    public static void Helper(String s, List<List<String>> res, List<String> list, int idx){
        if(idx == s.length()){
            res.add(new ArrayList<>(list));
            return;
        }

        for(int i = idx; i<s.length(); i++){
            if(isPalindrome(s, idx, i)){
                list.add(s.substring(idx, i+1));
                Helper(s, res, list, i+1);
                list.remove(list.size()-1);
            }
        }
    }


    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        Helper(s, res, new ArrayList<>(), 0);
        return res;
    }
}