class Solution {

    public static void HelperFunc(List<String> str, int open, int close, String s){
        if(open == 0 && close == 0){
            str.add(s);
            return;
        }

        if(open > 0){
            HelperFunc(str, open-1, close, s + "(");
        }

        if(open < close){
            HelperFunc(str, open, close-1, s + ")");
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> s = new ArrayList<String>();
        int open = n;
        int close = n;
        HelperFunc(s, n, n, "");
        return s;
    }
}