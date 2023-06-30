class Solution {

    public static String[] map = {".", ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wzyx"};

    public static void Helper(String str, String op, List<String> res){
        if(str.length() == 0){
            res.add(op);
            return;
        }
        String key = map[str.charAt(0)-48];
        for(int i = 0; i<key.length(); i++){
            Helper(str.substring(1), op+key.charAt(i), res);
        }
    }

    public List<String> letterCombinations(String digits) {
        List<String> res= new ArrayList<>();
        if(digits.length() == 0){
            return res;
        }
        Helper(digits, "", res);
        return res;
    }
}