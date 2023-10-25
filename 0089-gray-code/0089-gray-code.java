class Solution {

    public static List<String> helper(int n){
        if(n == 1){
            List<String> base = new ArrayList<>();
            base.add("0");
            base.add("1");
            return base;
        }
        List<String> res1 = helper(n-1);
        List<String> resFinal = new ArrayList<>();
        for(int i = 0; i<res1.size(); i++){
            resFinal.add("0"+res1.get(i));
        }
        for(int i = res1.size()-1; i>=0; i--){
            resFinal.add("1"+res1.get(i));
        }
        return resFinal;
    }

    public List<Integer> grayCode(int n) {
        List<Integer> list = new ArrayList<Integer>();
        List<String> help = helper(n);
        for(int i = 0; i<help.size(); i++){
            list.add(Integer.parseInt(help.get(i), 2));
        }
        return list;
    }
}